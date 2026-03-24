// Package untuk kalkulator
package simplekalkulator_24552011297;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Kelas kalkulator dengan nama Kalkulator_24552011297
public class Kalkulator_24552011297 extends JFrame {
    // Komponen GUI
    private JTextField display;
    private String operator = "";
    private double num1, num2, result;

    // Konstruktor untuk mengatur GUI
    public Kalkulator_24552011297() {
        // Set judul dan layout
        setTitle("Kalkulator Sederhana");
        setLayout(new BorderLayout());

        // Menampilkan layar (text field)
        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 24));
        add(display, BorderLayout.NORTH);

        // Panel untuk tombol-tombol
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        // Tombol-tombol kalkulator
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "C", "0", "=", "+"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.PLAIN, 20));
            button.addActionListener(new ButtonClickListener());
            panel.add(button);
        }

        // Menambahkan panel ke frame
        add(panel, BorderLayout.CENTER);

        // Pengaturan default frame
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center di layar
    }

    // ActionListener untuk menangani klik tombol
    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            // Jika tombol "C" ditekan, reset semua
            if (command.equals("C")) {
                display.setText("");
                num1 = num2 = result = 0;
                operator = "";
            }
            // Jika tombol "=" ditekan, hitung hasilnya
            else if (command.equals("=")) {
                num2 = Double.parseDouble(display.getText());
                switch (operator) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            display.setText("Error");
                            return;
                        }
                        break;
                }
                display.setText(String.valueOf(result));
                num1 = result;
                operator = "";
            }
            // Jika tombol angka atau operator ditekan
            else {
                if ("0123456789".contains(command)) {
                    display.setText(display.getText() + command);
                } else {
                    if (!operator.isEmpty()) return; // Menghindari operator ganda
                    num1 = Double.parseDouble(display.getText());
                    operator = command;
                    display.setText("");
                }
            }
        }
    }

    // Program utama
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Kalkulator_24552011297().setVisible(true);
            }
        });
    }
}
