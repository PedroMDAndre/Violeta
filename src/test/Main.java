package test;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Violeta!");
        int a =5;
        int b = 10;
        System.out.println("Soma de a com b = " + add(a, b));
    }

    // This is simpler than it looks

    private static int add(int a, int b) {
        return a + b;
    }

}
