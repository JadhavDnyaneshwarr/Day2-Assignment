package com.bridgelabz.assignment;

import java.util.Scanner;

public class AssignmentQue1 {
    public static void main(String[] args) {
        System.out.println("welcome to Day 2 assignment");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number => ");
        int num = scanner.nextInt();
        if (num==1){
            System.out.println("the enter number is One.");
        }else if (num==2) {
            System.out.println("the enter number is Two.");
        }else if (num==3) {
            System.out.println("the enter number is Three.");
        }else if (num==4) {
            System.out.println("the enter number is Four.");
        }else if (num==5) {
            System.out.println("the enter number is Five.");
        }else if (num==6) {
            System.out.println("the enter number is Six.");
        }else if (num==7) {
            System.out.println("the enter number is Seven.");
        }else if (num==8) {
            System.out.println("the enter number is Nine.");
        }else if (num==9) {
            System.out.println("the enter number is Ten.");
        }else if (num==0) {
            System.out.println("the enter number is Zero.");
        }else {
            System.out.println("the enter number is Invalid.");
        }
    }
}
