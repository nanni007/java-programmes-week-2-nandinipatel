package JavaProgrammes;

import java.util.Scanner;

public class Programme_13_Average {
    public static void main(String[] args) {
        //declaring scanner using "scan" as object
        //scanner to print statements
        Scanner scan = new Scanner(System.in);
        System.out.println("Input number one");
        int x = scan.nextInt();
        System.out.println("Input number two");
        int y = scan.nextInt();
        System.out.println("Input number three");
        int z = scan.nextInt();
        //calling method to the scanner
        myAve(x, y, z);
        //closing scanner
        scan.close();
    }
// Using Static method
    public static void myAve(int xx, int yy, int zz) {

        int Output = (xx + yy + zz) / 3;
        System.out.println("Average of Input is: " + Output);

    }
}
