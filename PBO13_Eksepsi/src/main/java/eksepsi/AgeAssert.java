package eksepsi;

import java.util.Scanner;

public class AgeAssert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan umur: ");
        int age = sc.nextInt();

        assert (age > 0) : "Umur harus lebih dari 0";

        if (age >= 18) {
            System.out.println("Congrats! You're an adult! =)");
        } else {
            System.out.println("You're under 18.");
        }
    }
}