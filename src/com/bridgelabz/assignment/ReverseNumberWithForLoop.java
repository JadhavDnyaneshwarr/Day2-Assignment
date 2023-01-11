package com.bridgelabz.assignment;

import java.util.Scanner;

public class ReverseNumberWithForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number => ");
        int num = scanner.nextInt();
        int rev = 0;
        int qu = 0;
        for (; num!=0; num = num/10){
            qu = num %10;
            rev = rev * 10 + qu;

        }
        System.out.println(rev);
    }
}
