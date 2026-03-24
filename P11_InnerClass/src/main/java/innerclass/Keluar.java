package innerclass;

public class Keluar {

    // Class dalam/Inner Class Pertama
    private class Mobil {

        private String merk = "Daihatsu";
        private float kecepatan = 360.0f;

        private void jalankan() {
            System.out.println("Merk Mobil: " + merk);
            System.out.println("Kecepatan Mobil: " + kecepatan);
        }
    }

    // Class dalam/Inner Class Kedua
    private class Pengguna {

        private String nama = "Adi";
        private int umur = 45;

        private void identitas() {
            System.out.println("Nama Saya: " + nama);
            System.out.println("Usia Saya: " + umur);
        }
    }

    public static void main(String[] args) {
        // Membuat instance dari KelasLuar
        Keluar outerclass = new Keluar();

        // Membuat instance dari KelasDalam (Mobil)
        Keluar.Mobil data1 = outerclass.new Mobil();

        // Membuat instance dari KelasDalam (Pengguna)
        Keluar.Pengguna data2 = outerclass.new Pengguna();

        // Menampilkan hasil output
        System.out.println("===== DATA DARI CLASS MOBIL =====");
        data1.jalankan();

        System.out.println("===== DATA DARI CLASS PENGGUNA =====");
        data2.identitas();
    }
}