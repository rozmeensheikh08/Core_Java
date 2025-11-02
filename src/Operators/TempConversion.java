package Operators;

import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter temperature in °F : ");

        double temInCel= sc.nextDouble();
        double newTempInFer= (temInCel-32)*5/9.0;
        System.out.println(" converted temperature in °C = " + newTempInFer + "°C");


        System.out.print(" Enter temperature in °C : ");
        double temInFer = sc.nextDouble();
        double newTempInCel = (temInFer* 9/5.0) + 32;



        System.out.println(" converted temperature in °F = " + newTempInCel + "°F");

        sc.close();
    }
}
