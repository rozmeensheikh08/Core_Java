package Operators;

import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter First Number : ");
        int a = sc.nextInt();

        System.out.print(" Enter Second Number : ");
        int b = sc.nextInt();

        System.out.print(" Enter Third Number : ");
        int c = sc.nextInt();
        int max = (a > b)? ((a > c)? a : c ): ((b > c)? b : c );
        System.out.println(max);
        sc.close();

    }
}
