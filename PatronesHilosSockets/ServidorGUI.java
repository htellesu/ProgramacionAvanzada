import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class ServidorGUI {
    private static ServerSocket serverSocket;
    private static Socket clientSocket;
    private static PrintWriter mensajeSalida;
    private static BufferedReader mensajeEntrada;
    private static JTextArea textArea;
    private static BufferedWriter historialChat;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });

        try {
            int puerto = 12345;  // Puedes cambiar el puerto si es necesario
            serverSocket = new ServerSocket(puerto);
            System.out.println("Servidor iniciado y esperando conexiones en el puerto " + puerto + "...");
            clientSocket = serverSocket.accept();
            System.out.println("Cliente conectado: " + clientSocket.getInetAddress());
            mensajeSalida = new PrintWriter(clientSocket.getOutputStream(), true);
            mensajeEntrada = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            historialChat = new BufferedWriter(new FileWriter("historial_chat_servidor.txt", true));

            // Hilo para leer mensajes del cliente
            Thread threadLectura = new Thread(new Runnable() {
                public void run() {
                    try {
                        String mensajeCliente;
                        while ((mensajeCliente = mensajeEntrada.readLine()) != null) {
                            textArea.append("Cliente: " + mensajeCliente + "\n");
                            System.out.println("Cliente: " + mensajeCliente);  // Agregado para depuración
                            historialChat.write("Cliente: " + mensajeCliente + "\n");
                            historialChat.flush();
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

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Chat Servidor");
        textArea = new JTextArea(20, 50);
        JTextField textField = new JTextField(50);
        JButton sendButton = new JButton("Send");

        textArea.setEditable(false);
        JPanel panel = new JPanel();
        panel.add(textField);
        panel.add(sendButton);
        frame.add(new JScrollPane(textArea), BorderLayout.CENTER);
        frame.add(panel, BorderLayout.SOUTH);

        sendButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String mensaje = textField.getText();
                if (!mensaje.isEmpty()) {
                    mensajeSalida.println(mensaje);  // Envía el mensaje al cliente
                    textField.setText("");
                    textArea.append("Servidor: " + mensaje + "\n");  // Muestra el mensaje del servidor en el área de texto
                    try {
                        historialChat.write("Servidor: " + mensaje + "\n");
                        historialChat.flush();
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
