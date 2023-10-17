package JavaProgrammes;

import java.util.Scanner;

public class ProgrammeBinaryNumbers16 {
    //Declaring scanner using "scan" as object
    //Scanner to print statements
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first binary number");
        int y = scan.nextInt();
        System.out.println("Enter second binary number");
        int z = scan.nextInt();
        //calling method to the scanner
        B1(y, z);
        //closing scanner
        scan.close();
    }

    public static void B1(int y, int z) {
        int number1 = Integer.parseInt(int num1);
        int number2 = Integer.parseInt(int num2);
        int Output = number1 + number1;
        String binOutput = Integer.toBinaryString(Output);
        System.out.println("Value of two binary numbers is: " + binOutput);
    }
}