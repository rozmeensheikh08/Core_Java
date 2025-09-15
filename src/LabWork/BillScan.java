package LabWork;

import java.util.Scanner;

public class BillScan {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter number of Paracetamol tab Strip : ");
        int a = sc.nextInt();

        System.out.print(" Enter number of Pan D tab Strip : ");
        int b = sc.nextInt();

        System.out.print(" Enter number of Vitamin D tab Strip : ");
        int c = sc.nextInt();

        System.out.print(" Enter number of Disprin strip : ");
        int d = sc.nextInt();

        System.out.print(" Enter number of Dolo strip : ");
        int e = sc.nextInt();

        double pera = a*10;
        double pan = b*33;
        double vit = c*45;
        double disprin = d*12;
        double dolo = e*40;

        double total = pera + pan + vit + disprin + dolo;

        double discount = 15;

        double finalAmount = total - ((discount*total)/100);

        System.out.println(" ");

        System.out.println("Welcome to Codeez Medical Shop..!!!");

//        System.out.println(" Peracetamol Tab " + a + " Strip = " + pera);
//        System.out.println(" Pan D tab " + b + " strip = " + pan);
//        System.out.println(" Vitamin D tab " + c + " strip = " + vit);
//        System.out.println(" Disprin " + d + " strip = " + disprin);
//        System.out.println(" Dolo " + e + " strip = " + dolo);
//        System.out.println(" Given discount on purchase = " + discount + "%");
//        System.out.println(" Total amount = " + total);
//        System.out.println(" Final amount = " + finalAmount);


        System.out.println(" \nPeracetamol Tab " + a + " Strip = " + pera +
                " \nPan D tab " + b + " strip = " + pan +
                        " \nVitamin D tab " + c + " strip = " + vit +
                " \nDisprin " + d + " strip = " + disprin +
                " \nDolo " + e + " strip = " + dolo +
                " \nGiven discount on purchase = " + discount + "%" +
                " \nTotal amount = " + total +
                        " \nFinal amount = " + finalAmount);

        sc.close();




    }
}
