package Strings;

import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Password : ");
        String pass = sc.nextLine();
       String newPass = pass.toLowerCase();
        if (pass.length()>=8){
            if (pass.contains("0")||pass.contains("1")||pass.contains("2")||pass.contains("3")||pass.contains("4")||pass.contains("5")||pass.contains("6")||pass.contains("7")||pass.contains("8")||pass.contains("9")){
                    if (pass.equals(newPass)){
                        System.out.println(" must contain at least one uppercase letter ");
                    }else{
                        System.out.println(" Strong Password");
                    }
            }else {
                System.out.println(" Password must contain at least one number ");
            }
        }else {
            System.out.println(" Password must be at least 8 characters");
        }
        sc.close();
    }
}



