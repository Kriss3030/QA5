public class Main {
    public static void main(String[] args) {
        int a = 7;
        int b = 9;
        a = b - a; //a - 2;
        b = b - a; //b - 7;
        a = b + a; //a - 9;
        System.out.println(a);
        System.out.println(b);

    }
}