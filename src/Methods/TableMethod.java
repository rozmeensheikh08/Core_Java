package Methods;

import java.util.Scanner;

public class TableMethod {
    static void table(int a){
        for (int i = 1; i<=10; i++){
            System.out.println(a*i);

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Number : ");
        int num = sc.nextInt();
        TableMethod.table(num);
        sc.close();
    }
}
