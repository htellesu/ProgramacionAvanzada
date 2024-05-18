//Maneja el chat entre un servidor y un cliente utilizando sockets. También crea interfaces gráficas (GUI) para la interacción del servidor y el cliente, y guarda el historial del chat en archivos de texto.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class ChatManager implements Runnable {
    private ServerSocket serverSocket;
    private Socket serverSocketCliente;
    private Socket clientSocket;
    private PrintWriter serverOutput;
    private BufferedReader serverInput;
    private PrintWriter clientOutput;
    private BufferedReader clientInput;
    private JTextArea serverTextArea;
    private JTextArea clientTextArea;
    private BufferedWriter serverHistorialChat;
    private BufferedWriter clientHistorialChat;

    @Override
    public void run() {
        // Crear y lanzar el hilo del servidor
        Thread serverThread = new Thread(new Runnable() {
            public void run() {
                runServer();
            }
        });

        // Crear y lanzar el hilo del cliente
        Thread clientThread = new Thread(new Runnable() {
            public void run() {
                runClient();
            }
        });

        serverThread.start();
        clientThread.start();
    }

    private void runServer() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowServerGUI();
            }
        });

        try {
            int puerto = 12345;  // Puedes cambiar el puerto si es necesario
            serverSocket = new ServerSocket(puerto);
            System.out.println("Servidor iniciado y esperando conexiones en el puerto " + puerto + "...");
            serverSocketCliente = serverSocket.accept();
            System.out.println("Cliente conectado: " + serverSocketCliente.getInetAddress());
            serverOutput = new PrintWriter(serverSocketCliente.getOutputStream(), true);
            serverInput = new BufferedReader(new InputStreamReader(serverSocketCliente.getInputStream()));
            serverHistorialChat = new BufferedWriter(new FileWriter("historial_chat_servidor.txt", true));

            // Hilo para leer mensajes del cliente
            Thread threadLectura = new Thread(new Runnable() {
                public void run() {
                    try {
                        String mensajeCliente;
                        while ((mensajeCliente = serverInput.readLine()) != null) {
                            serverTextArea.append("Cliente: " + mensajeCliente + "\n");
                            System.out.println("Cliente: " + mensajeCliente);  // Agregado para depuración
                            serverHistorialChat.write("Cliente: " + mensajeCliente + "\n");
                            serverHistorialChat.flush();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
            threadLectura.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void runClient() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowClientGUI();
            }
        });

        try {
            int puerto = 12345;  // Puedes cambiar el puerto si es necesario
            clientSocket = new Socket("localhost", puerto);
            clientOutput = new PrintWriter(clientSocket.getOutputStream(), true);
            clientInput = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            clientHistorialChat = new BufferedWriter(new FileWriter("historial_chat_cliente.txt", true));

            // Hilo para leer mensajes del servidor
            Thread threadLectura = new Thread(new Runnable() {
                public void run() {
                    try {
                        String mensajeServidor;
                        while ((mensajeServidor = clientInput.readLine()) != null) {
                            clientTextArea.append("Servidor: " + mensajeServidor + "\n");
                            System.out.println("Servidor: " + mensajeServidor);  // Agregado para depuración
                            clientHistorialChat.write("Servidor: " + mensajeServidor + "\n");
                            clientHistorialChat.flush();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
            threadLectura.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createAndShowServerGUI() {
        JFrame frame = new JFrame("Chat Servidor");
        serverTextArea = new JTextArea(20, 50);
        JTextField textField = new JTextField(50);
        JButton sendButton = new JButton("Send");

        serverTextArea.setEditable(false);
        JPanel panel = new JPanel();
        panel.add(textField);
        panel.add(sendButton);
        frame.add(new JScrollPane(serverTextArea), BorderLayout.CENTER);
        frame.add(panel, BorderLayout.SOUTH);

        sendButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String mensaje = textField.getText();
                if (!mensaje.isEmpty()) {
                    serverOutput.println(mensaje);  // Envía el mensaje al cliente
                    textField.setText("");
                    serverTextArea.append("Servidor: " + mensaje + "\n");  // Muestra el mensaje del servidor en el área de texto
                    try {
                        serverHistorialChat.write("Servidor: " + mensaje + "\n");
                        serverHistorialChat.flush();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private void createAndShowClientGUI() {
        JFrame frame = new JFrame("Chat Cliente");
        clientTextArea = new JTextArea(20, 50);
        JTextField textField = new JTextField(50);
        JButton sendButton = new JButton("Send");

        clientTextArea.setEditable(false);
        JPanel panel = new JPanel();
        panel.add(textField);
        panel.add(sendButton);
        frame.add(new JScrollPane(clientTextArea), BorderLayout.CENTER);
        frame.add(panel, BorderLayout.SOUTH);

        sendButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String mensaje = textField.getText();
                if (!mensaje.isEmpty()) {
                    clientOutput.println(mensaje);  // Envía el mensaje al servidor
                    textField.setText("");
                    clientTextArea.append("Cliente: " + mensaje + "\n");  // Muestra el mensaje del cliente en el área de texto
                    try {
                        clientHistorialChat.write("Cliente: " + mensaje + "\n");
                        clientHistorialChat.flush();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
