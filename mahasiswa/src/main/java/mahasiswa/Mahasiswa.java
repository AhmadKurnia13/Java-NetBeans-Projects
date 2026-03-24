package mahasiswa;

public class Mahasiswa {

    String Membaca;
    int Buku;
    String NYontek;
    int NilaiBerkurang;
    String Modifikasi;
    int NilaiTambah;

    public static void main(String[] args) {
        Mahasiswa mahasiswaku = new Mahasiswa();
        /* memanggil atribut  dan memberi nilai */
        mahasiswaku.Membaca = "Buku Buku";
        mahasiswaku.NYontek = "NilanyaBerkurang";
        mahasiswaku.Modifikasi = "NilaiTambah";
        System.out.println("mahasiswa mahasiswaku");
        System.out.println("mahasiswaku membaca : " + mahasiswaku.Membaca);
        System.out.println("Mahasiswaku Nyontek Pas UTS   : " + mahasiswaku.NYontek);
        System.out.println("Mahasiswaku memodifikasi : " + mahasiswaku.Modifikasi);
    }

    String getAlamat() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    String getNIM() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    String getNama() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}