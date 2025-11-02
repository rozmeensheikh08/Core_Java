package Methods;

import java.util.Scanner;

public class EvenMethod {
    static class EvenOdd {
        static String even(int a){
            if (a%2==0){
             return(" Even ");
            }else {
                return(" Odd ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Number : ");
        int num = sc.nextInt();

        String result = EvenOdd.even(num);
        System.out.println(result);

        sc.close();
    }
}
