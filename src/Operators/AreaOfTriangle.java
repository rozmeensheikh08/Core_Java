package Operators;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter value of height : ");
        double h = sc.nextDouble();

        System.out.print(" Enter value of base : ");
        double b = sc.nextDouble();

        double area = (0.5)*h*b;

        System.out.println(" Area of Triangle = " + area);


        sc.close();
    }
}
