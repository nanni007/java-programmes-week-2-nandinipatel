package JavaProgrammes;

import java.util.Scanner;

public class Programme_10_Multiplication {
    public static void main(String[] args) {
        //Declaring scanner using "scan" as object
        //scanner to print statements
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a number <=10");
        int a = scan.nextInt();
        //calling method to the scanner
        myMethod(a);
        scan.close();
    }

    public static void myMethod(int b ){
        int Output = (8 * b);
        System.out.println("Output of Multiplication 8 multiplied by " + b + " is: " + Output);
    }

}
