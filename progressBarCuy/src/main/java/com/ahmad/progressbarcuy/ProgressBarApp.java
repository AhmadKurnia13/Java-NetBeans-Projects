/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ahmad.progressbarcuy;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author MyBook Hype AMD
 */
public class ProgressBarApp extends JFrame{

    private JProgressBar progressBar;
    private JButton btnTambah, btnKurang;
    private int progress = 0;

    public ProgressBarApp() {
        // Atur judul frame
        setTitle("Progress Bar Simple");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        // Membuat progress bar
        progressBar = new JProgressBar(0, 100);
        progressBar.setPreferredSize(new Dimension(300, 30));
        progressBar.setValue(progress);
        progressBar.setStringPainted(true); // Menampilkan angka pada progress bar

        // Membuat tombol tambah
        btnTambah = new JButton("Tambah");
        btnTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                increaseProgress();
            }
        });

        // Membuat tombol kurang
        btnKurang = new JButton("Kurang");
        btnKurang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                decreaseProgress();
            }
        });

        // Tambahkan komponen ke frame
        add(progressBar);
        add(btnTambah);
        add(btnKurang);
    }

    // Fungsi untuk menambah progress
    private void increaseProgress() {
        if (progress < 100) {
            progress += 10; // Tambah 10%
            progressBar.setValue(progress);
        }
    }

    // Fungsi untuk mengurangi progress
    private void decreaseProgress() {
        if (progress > 0) {
            progress -= 10; // Kurang 10%
            progressBar.setValue(progress);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ProgressBarApp().setVisible(true);
            
        });
    }
}
