package Methods;

import java.util.Scanner;

public class MaxMethod {
    static class Maximum {
        static int max(int a , int b){
            if (a>b){
                return a;
            }else {
                return b;
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter First name : ");
        int firstName = sc.nextInt();
        System.out.print(" Enter Second name : ");
        int secondName = sc.nextInt();

        int maxNum = Maximum.max(firstName,secondName);
        System.out.println(maxNum);
        sc.close();

    }
}
