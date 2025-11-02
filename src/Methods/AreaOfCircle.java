package Methods;

import java.util.Scanner;

public class AreaOfCircle {
    static void area(double a){
        System.out.println("Area of Circle = " + 3.14*a*a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Radius Of Circle : ");
        double r = sc.nextDouble();
       area(r);
    }
}
