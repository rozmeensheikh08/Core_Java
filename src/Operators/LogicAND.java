package Operators;

import java.util.Scanner;

public class LogicAND {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Your age : ");
        int age = sc.nextInt();
        System.out.print(" Do you Have license ? true/False " );
        boolean license = sc.nextBoolean();

        int  adult = 18;
        boolean haveLicense = true;

        System.out.println(" if true then you can drive  ");
        System.out.println(" if false then you can't drive  ");

        System.out.println((age>=adult) && (license == haveLicense));

        sc.close();

    }
}
