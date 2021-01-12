package test;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Violeta!");
        int a =5;
        int b = 10;
        System.out.println("Soma de a com b = " + add(a, b));
        System.out.println("Divisão de " + a + " e " + b + " = " + div(a, b));
        System.out.println("Subtracção de a com b = " + subtraction(a,b));
        System.out.println("Multiplicação de a com b" + multi(a,b));
    }

    // This is simpler than it looks


    private static int add(int a, int b){
        return a+b;
    }
    private static int multi(int a, int b){
        return a*b;
    }

    private static int div(int a, int b) {
        return a/b;
    }

    private static int subtraction(int a, int b){
        return a-b;
    }
}
