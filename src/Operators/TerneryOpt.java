package Operators;

import java.util.Scanner;

public class TerneryOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter First Number : ");
        double firstNum = sc.nextDouble();

        System.out.print(" Enter Second Number : ");
        double secondNum = sc.nextDouble();

        double max = (firstNum>secondNum) ? firstNum  : secondNum ;

        System.out.println(" maximum = " + max);


        sc.close();
    }
}
