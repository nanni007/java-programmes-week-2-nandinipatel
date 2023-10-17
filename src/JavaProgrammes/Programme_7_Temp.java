package JavaProgrammes;

import java.util.Scanner;

public class Programme_7_Temp {
    public static void main(String[] args) {
        //Declaring scanner using "scan" as object
        //Scanner to print statements
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert Temperature in Degrees Celsius: ");
        double x = scan.nextInt();
        //calling method to the scanner
        Temperature(x);
        //closing scanner
        scan.close();
    }

    //Using Static method
    public static void Temperature(double F) {
        double z = (F - 32) * (float) 5 / 9;
        System.out.println("Fahrenheit temperature to celsius: " + z);
    }

}
