package Methods;

import java.util.Scanner;

public class calMethods {
    static class CalculatorExample {

        static double add(double a, double b) {
            return a + b;
        }

        static double sub(double a, double b) {
            return a - b;
        }

        static double multiply(double a, double b) {
            return a * b;
        }

        static double division(double a, double b) {
            return a / b;
        }

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double addResult = CalculatorExample.add(c, d);
        System.out.println(" Addition = " + addResult);

        double subResult = CalculatorExample.sub(c, d);
        System.out.println(" substraction = " + subResult);

        double multiplyResult = CalculatorExample.multiply(c, d);
        System.out.println(" Multiplication = " + multiplyResult);

        double divisionResult = CalculatorExample.division(c, d);
        System.out.println(" division = " + divisionResult);

    sc.close();
    }

}
