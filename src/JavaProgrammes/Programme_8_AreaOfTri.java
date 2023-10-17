package JavaProgrammes;

import java.util.Scanner;

public class Programme_8_AreaOfTri {
    public static void main(String[] args) {
        //Declaring scanner using "scan" as object
        //Scanner to print statements
        Scanner scan = new Scanner(System.in);
        System.out.println("Input base of Triangle");
        int b = scan.nextInt();
        System.out.println("Input height of Triangle");
        int h = scan.nextInt();
        //calling method to the scanner
        Area(b, h);
        //closing scanner
        scan.close();
    }

    //Using static method
    public static void Area(int bb, int hh) {
        int Output = (bb * hh) / 2;
        System.out.println("Area of Triangle is: " + Output);

    }
}