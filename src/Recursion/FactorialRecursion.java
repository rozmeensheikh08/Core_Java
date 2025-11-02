package Recursion;

import java.util.Scanner;

public class FactorialRecursion {
    static class Factorial{
        int fact(int n) {
            if (n <= 1) {
                return 1;
            } else {
                return (n * fact(n-1));
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Number : ");
        int a = sc.nextInt();
        Factorial product = new Factorial();
        int result = product.fact(a);
        System.out.println(result);
    }
}
