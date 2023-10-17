package JavaProgrammes;

public class Programme_4 {
    //Declaring instant variables
    int a = 5;
    int b = 101;
    //Declaring two Static variable
    static String name1 = "Pandavs";
    static String name2 = "Kauravs";

    //Declaring one instant method
    public void myMethod() {

        System.out.println(a);
        System.out.println(b);
        System.out.println(name1);
        System.out.println(name2);
    }

    //Declaring one Static method
    public static void myMirror() {
        Programme_4 P1 = new Programme_4();
        Programme_4 P2 = new Programme_4();
        System.out.println(P1.a);
        System.out.println(P2.b);
        System.out.println(name1);
        System.out.println(name2);
    }

    public static void main(String[] args) {
        Programme_4 P3 = new Programme_4();
        P3.myMethod();
        myMirror();
    }
}
