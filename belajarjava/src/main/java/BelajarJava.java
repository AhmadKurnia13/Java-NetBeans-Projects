// Nama file: BelajarJava.java
public class BelajarJava {

    // Method 1: menambah dua bilangan
    static int tambah(int var1, int var2) {
        return var1 + var2;
    }

    // Method 2: menambah tiga bilangan
    static int tambah(int var1, int var2, int var3) {
        return var1 + var2 + var3;
    }

    // Method 3: menambah dua string
    static String tambah(String var1, String var2) {
        return var1 + " tambah " + var2;
    }

    // Method utama
    public static void main(String[] args) {
        System.out.println(tambah(1, 2));         // Memanggil method pertama
        System.out.println(tambah(5, 4, 3));      // Memanggil method kedua
        System.out.println(tambah("satu", "dua")); // Memanggil method ketiga
    }
}