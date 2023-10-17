package JavaProgrammes;

public class Programme_3 {
    //Declaring one instant variable
    //Declaring one static variable
    int c = 15;
    static String name = "Automation Testing";

    //Declaring one instant method
    public void myMethod() {
        System.out.println(c);
        System.out.println(name);
    }

    //Declaring one static method
    public static void myMirror() {
        Programme_3 Four = new Programme_3();
        System.out.println(Four.c);
        System.out.println(name);
    }

    public static void main(String[] args) {
        Programme_3 Three = new Programme_3();
        Three.myMethod();
        myMirror();

    }


}
