package Strings;

import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Password : ");
        String pass = sc.nextLine(); // if Rozmeen
       String newPass = pass.toLowerCase();//then it is rozmeen
        int count = 0;
        if (pass.length()>=8){
            if (pass.contains("0")||pass.contains("1")||pass.contains("2")||pass.contains("3")||pass.contains("4")||pass.contains("5")||pass.contains("6")||pass.contains("7")||pass.contains("8")||pass.contains("9")){
                for (int i = 0; i < pass.length(); i++){
                    if (!pass.equals(newPass)){
                         count++;
                        //System.out.println(pass.charAt(i) == pass.toUpperCase().charAt(i));
                    }
                }
            }else {
                System.out.println(" Password must contain at least one number ");
            }
        }else {
            System.out.println(" Password must be at least 8 characters");
        }

        if (count == 0){
            System.out.println(" must contain at least one uppercase letter ");
        } else{
            System.out.println(" Strong Password");
        }
        sc.close();
    }
}





//        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//        for (int i = 0; i < pass.length(); i++) {
//            if ((pass.length()) == 8) {
                //System.out.println((pass.charAt(i)) == (pass.toUpperCase().charAt(i)));
//                for (int j = 0; j < nums.length; j++) {
//                    if (((pass.charAt(i)) == nums[j])) {
//                if ((pass.charAt(i)) == (pass.toUpperCase().charAt(i))) {
//                    System.out.println(" Strong Password");
//                    break;
//                } else {
//                    System.out.println(" must contain at least one uppercase letter ");
//                }
//            } else {
//                System.out.println(" Password must contain at least one number ");
//                break;
//
//            }
//        }else {
//                System.out.println(" Password must be at least 8 characters");
//                break;
//            }
       // }



