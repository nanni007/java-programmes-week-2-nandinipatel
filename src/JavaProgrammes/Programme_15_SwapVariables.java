package JavaProgrammes;

import java.util.Scanner;

public class Programme_15_SwapVariables {
    //Declaring scanner using "scan" as object
    //Scanner to print statements
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        int w = scan.nextInt();
        System.out.println("Enter second number");
        int x = scan.nextInt();
        //calling method to the scanner
        swap(w, x);
        //closing scanner
        scan.close();
    }

    //Using static method
    public static void swap(int y, int z) {
        System.out.println("Value before swap w : " + y + " and x : " + z);
        int a = y;
        y = z;
        z = y;

        System.out.println("Value after swap w : " + y + " and x : " + z);


    }
}
