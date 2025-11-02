package Operators;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter value of length : ");
        double l = sc.nextDouble();

        System.out.print(" Enter value of breath : ");
        double b = sc.nextDouble();

        double area = l*b;

        System.out.println(" Area of rectangle = " + area);





        sc.close();
    }

}
