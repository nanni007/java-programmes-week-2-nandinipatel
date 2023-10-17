package JavaProgrammes;

import java.util.Scanner;

public class Programme_18_add_Subtract_Multiply_Divide {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Please enter first number = 125 ");
                int y = scan.nextInt();
                System.out.println("Please enter second number = 24 ");
                int z = scan.nextInt();
                Subtraction(y, z);
                Multiplication(y, z);
                Addition(y, z);
                Division(y, z);
                //closing scanner
                scan.close();
        }

        int y = 125;
        int z = 24;

        public static void Subtraction(int y, int z) {
                int Output = y - z;
                System.out.println("Subtraction of Two numbers " + y + " and " + z + " is: " + Output);

        }

        public static void Multiplication(int y, int z) {
                int Output = y * z;
                System.out.println("Multiplication of Two numbers " + y + " and " + z + " is: " + Output);

        }

        public static void Addition(int y, int z) {
                int Output = y + z;
                System.out.println("Addition of Two numbers " + y + " and " + z + " is: " + Output);
        }

        public static void Division(int y, int z) {
                int Output = y / z;
                System.out.println("Division of Two numbers " + y + " and " + z + " is: " + Output);
        }
}



