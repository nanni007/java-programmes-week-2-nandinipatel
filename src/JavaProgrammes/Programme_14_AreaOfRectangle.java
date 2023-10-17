package JavaProgrammes;

import java.util.Scanner;

public class Programme_14_AreaOfRectangle {
    public static void main(String[] args) {
        //Declaring scanner using "scan" as object
        //Scanner to print statements
        Scanner scan = new Scanner(System.in);
        System.out.println("For Area - Input Length of rectangle");
        int l1 = scan.nextInt();
        System.out.println("For Area - Input Width of rectangle");
        int w1 = scan.nextInt();
        System.out.println("For Perimeter - Input Length of rectangle");
        int l2 = scan.nextInt();
        System.out.println("For Perimeter - Input Width of rectangle");
        int w2 = scan.nextInt();
        //calling method to the scanner
        Area(l1, w1);
        Perimeter(l2, w2);
        //closing scanner
        scan.close();
    }

    //Using static method
    public static void Area(int l1, int w1) {
        int Output = (l1 * w1);
        System.out.println("Area of Rectangle is: " + Output);
    }
    public static void Perimeter(int l2, int w2) {
        int Output = 2 * (l2 + w2);
        System.out.println("Perimeter of Rectangle is: " + Output);
    }
}

