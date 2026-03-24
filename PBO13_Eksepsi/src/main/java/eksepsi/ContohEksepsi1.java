package eksepsi;

public class ContohEksepsi1 {

    public static void main(String[] args) {
        int[] A = new int[5];
        A[5] = 100; // SALAH, karena tidak terdapat indeks ke-5 (indeks 0-4)
    }
}