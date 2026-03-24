package damkar02;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.UIManager;

public class Damkar02 {

    public static void main(String[] args) {

        style();
        Dashboard d = new Dashboard();
        d.pack();
        d.setLocationRelativeTo(null);
        d.setResizable(false);
        d.setVisible(true);

    }

    //    Style
    private static void style() {

        FlatLightLaf.setup();

        UIManager.put("defaultFont", new Font("Segoe UI", Font.PLAIN, 14));

        // Button styling
        UIManager.put("Button.arc", 20); // biar rounded
        UIManager.put("Button.hoverBackground", new Color(255, 51, 51));
        UIManager.put("Button.hoverForeground", Color.BLACK);
        UIManager.put("Button.borderColor", Color.WHITE);
        UIManager.put("Button.focusedBorderColor", Color.WHITE);

        // Table header
        UIManager.put("TableHeader.background", new Color(0x2C3E50));
        UIManager.put("TableHeader.foreground", Color.WHITE);
        UIManager.put("TableHeader.font", new Font("Segoe UI Semibold", Font.PLAIN, 16));

        // --- PENGATURAN TEXTFIELD & TEXTAREA ---
// Font dasar
        UIManager.put("JTextField.font", new Font("Segoe UI", Font.PLAIN, 14));
        UIManager.put("JTextArea.font", new Font("Segoe UI", Font.PLAIN, 14));

// Padding/margin di dalam komponen agar tidak terlalu rapat
        UIManager.put("JTextField.padding", new Insets(5, 10, 5, 10)); // top, left, bottom, right
        UIManager.put("JTextArea.padding", new Insets(8, 10, 8, 10));

// Warna dasar
        UIManager.put("TextComponent.background", Color.WHITE);
        UIManager.put("TextComponent.foreground", Color.BLACK);
        UIManager.put("TextComponent.caretColor", new Color(0x2C3E50)); // Warna kursor disamakan dengan header tabel

// Warna saat teks di-highlight (disamakan dengan seleksi tabel)
        UIManager.put("TextComponent.selectionBackground", new Color(0xAED581));
        UIManager.put("TextComponent.selectionForeground", Color.BLACK);

// Pengaturan Border dan Fokus
        UIManager.put("Component.borderWidth", 1);
        UIManager.put("Component.borderColor", new Color(0xCCCCCC)); // Border abu-abu muda saat normal
        UIManager.put("Component.focusedBorderColor", new Color(0x2C3E50)); // Border biru tua saat fokus (sama seperti header tabel)

// (Opsional) Membuat sudut komponen sedikit membulat
        UIManager.put("Componenta.rc", 10); // Nilai 0 untuk kotak, semakin besar semakin bulat
    }

}
