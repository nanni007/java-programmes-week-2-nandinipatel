package JavaProgrammes;

public class Programme_1 {
    //Instance Variable - Within the class
    //Declaring two Instance variables
    int a = 5;
    String name = "Automation Testing";

    //Declaring one instance method & calling both instance variables
    public void myMethod() {
        System.out.println(a);
        System.out.println(name);
    }

    //Declaring the main method
    public static void main(String[] args) {
        //Calling above instance method in the main method
        Programme_1 j1 = new Programme_1();
        j1.myMethod();
    }
}
