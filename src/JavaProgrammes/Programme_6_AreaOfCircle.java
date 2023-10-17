package JavaProgrammes;

import java.util.Scanner;

public class Programme_6_AreaOfCircle {

    public static void main(String[] args) {
        //Declaring scanner using "scan" as object
        //Scanner to print statements
        Scanner scan = new Scanner(System.in);
        System.out.println("Input Radius of circle: ");
        int a = scan.nextInt();
        //calling method to the scanner
        radius(a);
        //closing scanner
        scan.close();
    }

    //Using Static variable and static method
    public static void radius(int rad) {
        double Output = 3.142 * rad * rad;
        System.out.println("Area of Circle is: " + Output);
    }
}
