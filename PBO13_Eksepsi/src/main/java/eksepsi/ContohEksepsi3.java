package eksepsi;

public class ContohEksepsi3 {

    public static void main(String[] args) {
        int pembilang = 2;
        int penyebut = 0;

        try {
            int hasil = pembilang / penyebut; // menimbulkan eksepsi
            System.out.println("Hasil = " + hasil); // tidak dieksekusi
        } catch (ArithmeticException ae) {
            System.out.println("KESALAHAN: " + "Terdapat pembagian dengan nol");
        }

        System.out.println("Statemen setelah blok try-catch");
    }
}