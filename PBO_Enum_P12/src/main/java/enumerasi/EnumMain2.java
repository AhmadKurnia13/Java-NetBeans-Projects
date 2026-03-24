package enumerasi;

import enumerasi.EnumHari2.Hari;

public class EnumMain2 {

    public static void main(String[] args) {
        Hari hari = Hari.SENIN;
        System.out.println("Hari: " + hari + ", Waktu: " + hari.getWaktu());
    }
}