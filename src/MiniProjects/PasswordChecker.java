package MiniProjects;

import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Password : ");
        String pass = sc.nextLine();
        String[] nums = {"0","1","2","3","4","5","6","7","8","9"};
        String lowerPass = pass.toLowerCase();
        String upperPass = pass.toUpperCase();
        int count =  0 ;

        if (pass.length()>=8){

            for (int i = 0 ; i < nums.length ; i++) {
                if (pass.contains(nums[i])) {
                    count++;
                }

                if ((count > 0 )&& (i == nums.length-1)) {
                    if (pass.equals(lowerPass)) {
                        System.out.println(" Password must contain at least one Upper case letter ");
                    } else if (pass.equals(upperPass)) {
                        System.out.println(" Password must contain at least one Lower case letter ");
                    } else  {
                        System.out.println(" Strong Password");
                    }
                }else if((count == 0 )&& (i == nums.length-1)) {
                    System.out.println(" Password must contain at least one number ");
                }

            }

        }else {
            System.out.println(" Password must be at least 8 characters");
        }

        sc.close();

    }
}

