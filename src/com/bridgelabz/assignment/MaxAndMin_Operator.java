package com.bridgelabz.assignment;

import java.util.Scanner;

public class MaxAndMin_Operator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number1 => ");
        int a = scanner.nextInt();
        System.out.println("enter the number2 => ");
        int b = scanner.nextInt();
        System.out.println("enter the number3 => ");
        int c = scanner.nextInt();
        int ans1 = a+b*c;
        float ans2 = (float) c+a/b;
        int ans3 = a%b+c;
        int ans4 = a*b+c;
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
        System.out.println(ans4);
    }
}
