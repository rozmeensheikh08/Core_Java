package Operators;

import java.util.Scanner;

public class percentExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter Total Marks : ");
        double total = sc.nextDouble();

        System.out.print(" Enter marks obtained : ");
        double obt = sc.nextDouble();

        System.out.println(" percentage = " + ((obt*100)/total) + "%");

        sc.close();
    }
}
