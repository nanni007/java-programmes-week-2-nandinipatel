package JavaProgrammes;

import java.util.Scanner;

public class Programme_9_UpperCase_LowerCase {
    //Calling main method and scanner
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter words: ");
        String txt = scan.nextLine();
        // Calling method to scanner
        message(txt);
        //closing scanner
        scan.close();
    }
    public static void message(String xyz) {
        String name = xyz.toLowerCase();
        System.out.println(name);
    }
}