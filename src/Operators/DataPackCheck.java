package Operators;

import java.util.Scanner;

public class DataPackCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter amount under 500 : ");
        double amount = sc.nextDouble();
         if (amount >= 300){
             System.out.print(" Do you have jio sim ? (Yes/No) : ");
             String jioSim = sc.next();
             sc.nextLine();
             if (jioSim.equals("Yes")) {
                 System.out.println(" Your package have unlimited calls and unlimited data with jioHotstar subscription ");
             } else {
                 System.out.println(" Your package have unlimited calls and 2GB/day data ");
             }
         } else {
             System.out.println(" Your package have limited calls and 1GB/day data");
         }
        sc.close();
    }
}
