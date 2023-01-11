package com.bridgelabz.assignment;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number => ");
        int num = scanner.nextInt();
        int number = num;
        int rev = 0;
        int qu = 0;
        for (; number!=0; number = number/10) {
            qu = number % 10;
            rev = rev * 10 + qu;
        }
        if (num==rev){
            System.out.println("the number " + num + " is palindrome number");
        }else {
            System.out.println("the number " + num + " is not palindrome number");
        }
    }
}
