package com.mycompany.kalkulatorsederhana;

import javax.swing.JOptionPane;

public class Kalkulator {
    public static void main(String[] args) {
        while (true) {
            // Menampilkan menu operasi
            String menu = """
                          Pilih operasi:
                          1. Penjumlahan
                          2. Pengurangan
                          3. Perkalian
                          4. Pembagian
                          5. Keluar""";
            
            String pilihan = JOptionPane.showInputDialog(menu);
            
            if (pilihan == null || pilihan.equals("5")) {
                JOptionPane.showMessageDialog(null, "Terima kasih telah menggunakan kalkulator.");
                break;
            }
            
            try {
                double angka1 = Double.parseDouble(JOptionPane.showInputDialog("Masukkan angka pertama: "));
                double angka2 = Double.parseDouble(JOptionPane.showInputDialog("Masukkan angka kedua: "));
                double hasil = 0;
                String operasi = "";
                
                switch (pilihan) {
                    case "1":
                        hasil = angka1 + angka2;
                        operasi = "Penjumlahan";
                        break;
                    case "2":
                        hasil = angka1 - angka2;
                        operasi = "Pengurangan";
                        break;
                    case "3":
                        hasil = angka1 * angka2;
                        operasi = "Perkalian";
                        break;
                    case "4":
                        if (angka2 == 0) {
                            JOptionPane.showMessageDialog(null, "Kesalahan: Pembagian dengan nol tidak diperbolehkan.");
                            continue;
                        }
                        hasil = angka1 / angka2;
                        operasi = "Pembagian";
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Pilihan tidak valid, silakan coba lagi.");
                        continue;
                }
                
                JOptionPane.showMessageDialog(null, "Hasil " + operasi + ": " + hasil);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Input tidak valid, masukkan angka yang benar.");
            }
        }
    }
}
