package wrapper;

import java.util.Locale;
import java.util.Scanner;

public class FloatDouble {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        float var1;
        double var2;

        System.out.print("var1 (float): ");
        var1 = input.nextFloat();

        System.out.print("var2 (double): ");
        var2 = input.nextDouble();

        System.out.println();
        System.out.println("### Hasil ###");
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
    }
}