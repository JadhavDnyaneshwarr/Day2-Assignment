package com.bridgelabz.assignment;

import java.util.Scanner;

public class DisplayInWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number(1,10,100,1000,100000,10000000 => ");
        int num = scanner.nextInt();

        if (num==1){
            System.out.println("the Enter number is Unit");
        }
        else if (num==10){
            System.out.println("the Enter number is Ten");
        }
        else if (num==100){
            System.out.println("the Enter number is hundred");
        }
        else if (num==1000){
            System.out.println("the Enter number is Thousand");
        }
        else if (num==100000){
            System.out.println("the Enter number is Lakh");
        }
        else if (num==10000000){
            System.out.println("the Enter number is Crore");
        }
        else {
            System.out.println("the Enter number is Invalid");
        }
    }
}
