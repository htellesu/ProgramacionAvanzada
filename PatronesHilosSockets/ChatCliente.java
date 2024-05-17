import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class ChatCliente {
    private static Socket socket;
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
            socket = new Socket("localhost", puerto);
            mensajeSalida = new PrintWriter(socket.getOutputStream(), true);
            mensajeEntrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            historialChat = new BufferedWriter(new FileWriter("historial_chat_cliente.txt", true));

            // Hilo para leer mensajes del servidor
            Thread threadLectura = new Thread(new Runnable() {
                public void run() {
                    try {
                        String mensajeServidor;
                        while ((mensajeServidor = mensajeEntrada.readLine()) != null) {
                            textArea.append("Servidor: " + mensajeServidor + "\n");
                            System.out.println("Servidor: " + mensajeServidor);  // Agregado para depuración
                            historialChat.write("Servidor: " + mensajeServidor + "\n");
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
        JFrame frame = new JFrame("Chat Cliente");
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
                    mensajeSalida.println(mensaje);  // Envía el mensaje al servidor
                    textField.setText("");
                    textArea.append("Cliente: " + mensaje + "\n");  // Muestra el mensaje del cliente en el área de texto
                    try {
                        historialChat.write("Cliente: " + mensaje + "\n");
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
