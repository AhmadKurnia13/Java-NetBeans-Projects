package bitwise;

public class Bitwise {

    public static void main(String[] args) {
        int a = 181;
        int b = 108;
        int hasil;
        hasil = a & b;
        System.out.println("Hasil dari a & b : " + hasil);
        hasil = a | b;
        System.out.println("Hasil dari a | b : " + hasil);
        hasil = a ^ b;
        System.out.println("Hasil dari a ^ b : " + hasil);
        hasil = ~a;
        System.out.println("Hasil dari ~a : " + hasil);
        hasil = a >> 1;
        System.out.println("Hasil dari a >> 1 : " + hasil);
        hasil = b << 2;
        System.out.println("Hasil dari b << 2 : " + hasil);
    }
}