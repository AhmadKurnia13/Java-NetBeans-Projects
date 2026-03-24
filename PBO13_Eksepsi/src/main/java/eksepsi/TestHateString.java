package eksepsi;

public class TestHateString {

    public static void main(String args[]) {
        String input = "invalid input";

        try {
            if (input.equals("invalid input")) {
                throw new HateStringExp();
            }
            System.out.println("Accept string.");
        } catch (HateStringExp e) {
            System.out.println("Hate string!");
        }
    }
}