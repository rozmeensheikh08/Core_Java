package Methods;

import java.util.Scanner;

public class AreaOfShapes {
    static class Shape{
         void triangle(double b , double h){
            System.out.println("Area of Triangle = " + 0.5*b*h);
        }
         void square(double a){
            System.out.println(" Area Of Square = " + a*a);
        }
        void circle(double r){
            System.out.println(" Area Of Circle = " + 3.14*r*r);
        }
        void rectangle(double l , double b){
            System.out.println(" Area Of Rectangle = " + l*b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" For Area Of Triangle - ");
        System.out.print(" Enter base of Triangle : ");
        double base = sc.nextDouble();
        System.out.print(" Enter height of Triangle : ");
        double height = sc.nextDouble();
        Shape s1 = new Shape();
        s1.triangle(base,height);

        System.out.println();

        System.out.println(" For Area Of Square - ");
        System.out.print(" Enter side of Square : ");
        double side = sc.nextDouble();
        Shape s2 = new Shape();
        s2.square(side);

        System.out.println();

        System.out.println(" For Area Of Circle - ");
        System.out.print(" Enter Radius of Circle : ");
        double radius = sc.nextDouble();
        Shape s3 = new Shape();
        s3.circle(radius);

        System.out.println();

        System.out.println(" For Area Of Rectangle - ");
        System.out.print(" Enter length of Rectangle : ");
        double length = sc.nextDouble();
        System.out.print(" Enter breadth of Rectangle : ");
        double breadth = sc.nextDouble();
        Shape s4 = new Shape();
        s4.rectangle(length,breadth);
    }
}
