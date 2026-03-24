package wrapper;

public class Bolean {

    public static void main(String args[]) {
        int A = 100, B = 30;

        boolean lb = A > B;
        boolean lk = A < B;
        boolean lbs = A >= B;
        boolean lks = A <= B;
        boolean sm = A == B;
        boolean tsm = A != B;

        System.out.println(A + " > " + B + " => " + lb);
        System.out.println(A + " < " + B + " => " + lk);
        System.out.println(A + " >= " + B + " => " + lbs);
        System.out.println(A + " <= " + B + " => " + lks);
        System.out.println(A + " == " + B + " => " + sm);
        System.out.println(A + " != " + B + " => " + tsm);
    }
}