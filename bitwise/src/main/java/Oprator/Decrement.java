package Oprator;

public class Decrement {

    public static void main(String args[]) {

        int a = 10;
        int b = 15;

        a--;
        System.out.println("Isi variabel a: " + a);

        --b;
        System.out.println("Isi variabel b: " + b);
        
  System.out.println("# Post Increment #"); 
  System.out.println("=================="); 
  System.out.println(" variabel a: " + a); 
  System.out.println("Isi variabel a: " + a++);
  System.out.println("Isi variabel a: " + a);
   
  System.out.println(); 
  System.out.println("# Pre Increment #"); 
  System.out.println("=================="); 
  System.out.println(" variabel b: " + b); 
  System.out.println("Isi variabel b: " + ++b);
  System.out.println("Isi variabel b: " + b);
  
    }
}