package Operators;

import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a : ");
        double a = sc.nextDouble();

        System.out.print("Enter b : ");
       double b = sc.nextDouble();

        System.out.println(" addition = " + (a + b));
        System.out.println(" substraction = " + (a - b));
        System.out.println(" multiplication = " + (a * b));
        System.out.println(" division = " + (a/b));

        sc.close();



    }
}
