package com.bridgelabz.assignment;

import java.util.Scanner;

public class AssignmentQue2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number => ");
        int num = scanner.nextInt();
        int rev = 0;
        int qu = 0;
        while (num != 0){
            qu = num % 10;
            rev = (rev * 10) + qu;
            num /=10;
        }
        System.out.println(rev);
    }
}
