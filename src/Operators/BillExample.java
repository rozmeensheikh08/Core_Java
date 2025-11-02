package Operators;

public class BillExample {
    public static void main(String[] args) {

        System.out.println(" Welcome to Codeez Medical Shop..!!! ");
        int pera = 10;
        int pan = 33;
        int vitamin = 45;
        int disprin = 12;
        int dolo = 40;

        int total = pera+pan+vitamin+disprin+dolo;

        int discount = 15;
        int finalAmonut = total - ((discount * total)/100);
        System.out.println(" - Peracetamol Tab 1 Strip - " + pera);
        System.out.println(" - Pan D tab 1 Strip - " + pan);
        System.out.println(" - Vitamin D tab 1 Strip - " + vitamin);
        System.out.println(" - Disprin 1 strip - " + disprin);
        System.out.println(" - Dolo 1 Strip - " + dolo);
        System.out.println(" - Given discount on purchase - " + discount + "%");

        System.out.println(" - Your total is : " + "Rupees "+ total);
        System.out.println(" - Your Final amount = " + "Rupees " + finalAmonut);

    }
}
