package Operators;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter value of First number : ");
        double firstNum = sc.nextDouble();

        System.out.print(" Enter value of Second number : ");
        double secondNum = sc.nextDouble();

        System.out.print(" Enter value of Third number : ");
        double thirdNum = sc.nextDouble();

        System.out.println(" Addition = " + (firstNum+secondNum+thirdNum));
        System.out.println(" Substraction = " + ( firstNum-secondNum-thirdNum));
        System.out.println(" Multiplication = " + (firstNum*secondNum*thirdNum));
        System.out.println(" Division = " + (firstNum/secondNum));
        System.out.println(" Division = " + (firstNum/thirdNum));




        sc.close();
    }
}
