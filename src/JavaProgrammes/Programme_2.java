package JavaProgrammes;

public class Programme_2 {
    //static variable - inside class outside main method with static
    //Declaring two Static variables
    static int b = 10;
    static String name = "Number";

    //Declaring one static method
    public static void myMethod() {
        System.out.println(b);
        System.out.println(name);
    }

    public static void main(String[] args) {
        myMethod();
    }
}
