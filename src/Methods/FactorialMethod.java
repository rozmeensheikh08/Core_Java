package Methods;

import java.util.Scanner;

public class FactorialMethod {
    static void fact( int a){
        int multi = 1;
        for (int i = 1; i<=a; i++){
            multi = multi * i;

        }
        System.out.println(multi);
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print(" Enter Number : ");
        int num = sc.nextInt();
        FactorialMethod.fact(num);
    }
}
