package eksepsi;

public class MultipleCatchError {

    public static void main(String args[]) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println(a / b);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("KESALAHAN: Argumen kurang (butuh 2 angka).");
        } catch (Exception ex) {
            System.out.println("KESALAHAN: " + ex.getMessage());
        }
    }
}