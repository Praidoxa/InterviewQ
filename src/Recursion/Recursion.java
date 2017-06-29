package Recursion;


public class Recursion {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(
        factorial(n));
    }

    private static int factorial(int n) {
        return n == 0 ? 1 : n*factorial(n-1);
    }
}
