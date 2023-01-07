package com.bridgelabz.assignment;

import java.util.Scanner;

public class AssignmentQue2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number => ");
        int num = scanner.nextInt();
        int sum = 0;
        int i = 0;
        while (i <= num){
            sum += i;
            i++;
        }
        System.out.println("he sum of the numbers upto given number is " + sum);
    }
}
