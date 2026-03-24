package inheritance1;

public class Sepeda {

    String warna;
    int tahunProduksi;
    int gir;

    // method mutator (setter) dengan parameter
    void setGir(int pertambahanGir) {
        gir = gir + pertambahanGir;
    }

    // method accessor (getter)
    int getGir() {
        return gir;
    }

    public static void main(String[] args) {
        // Membuat object
        Sepeda sepedaku = new Sepeda();

        /* Memanggil atribut dan memberi nilai */
        sepedaku.warna = "Hitam";
        sepedaku.tahunProduksi = 2006;
        sepedaku.gir = 2;

        sepedaku.setGir(2); // menambah gir

        System.out.println("Kring-kring Sepedaku...");
        System.out.println("Sepedaku berwarna  : " + sepedaku.warna);
        System.out.println("Diproduksi tahun   : " + sepedaku.tahunProduksi);
        System.out.println("Tambah gir         : " + sepedaku.gir);
        System.out.println("Pertambahan        : " + sepedaku.getGir());
    }
}
