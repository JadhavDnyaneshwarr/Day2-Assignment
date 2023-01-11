package com.bridgelabz.assignment;

import java.util.Scanner;

public class SumOffNaturalNumberWithForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number => ");
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i<=num; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
