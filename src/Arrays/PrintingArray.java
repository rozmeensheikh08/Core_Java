package Arrays;

public class PrintingArray {
    public static void main(String[] args) {
        String[] heros = {"Salman", "Rohit", "Varun","Tiger", "Aahan"};
//        System.out.println("lenght of Array " + heros.length);
//        for (int i = 0; i < heros.length; i++){
//            System.out.println(heros[i]);
//            //for-each loop

            for (String hero : heros){
                System.out.println(hero);

            }


        }
    }

