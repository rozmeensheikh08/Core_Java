package Methods;

import java.util.Scanner;

public class SquareMethod {
    static class Square{
        static int sqr(int a){
            return a*a;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter number : ");
        int num = sc.nextInt();
        int result = Square.sqr(num);
        System.out.println(result);
    }
}
