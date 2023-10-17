package JavaProgrammes;

import java.util.Scanner;

public class Programme_5_Calc {
    public static void main(String[] args) {
        //Declaring scanner using "scan" as object
        //Scanner to print statements
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first number:");
        int y = scan.nextInt();
        System.out.println("Please enter second number:");
        int z = scan.nextInt();
        //Calling all methods in the scanner
        //Instance methods
        Programme_5_Calc Calculator = new Programme_5_Calc();
        Calculator.Addition(y, z);
        Calculator.Division(y, z);

        //Static methods
        Subtraction(y, z);
        Multiplication(y, z);

        //closing scanner
        scan.close();
    }

    //1st Instance method
    public void Addition(int y, int z) {
        int Output = y + z;
        System.out.println("Addition of Two numbers " + y + " and " + z + " is: " + Output);
    }

    //2nd Instance method
    public void Division(int y, int z) {
        int Output = y / z;
        System.out.println("Division of Two numbers " + y + " and " + z + " is: " + Output);
    }

    //1st Static method
    public static void Subtraction(int y, int z) {
        int Output = y - z;
        System.out.println("Subtraction of Two numbers " + y + " and " + z + " is: " + Output);
    }

    //2nd Static method
    public static void Multiplication(int y, int z) {
        int Output = y * z;
        System.out.println("Multiplication of Two numbers " + y + " and " + z + " is: " + Output);

    }

}
