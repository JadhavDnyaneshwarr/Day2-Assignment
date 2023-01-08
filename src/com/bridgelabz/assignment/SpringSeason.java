package com.bridgelabz.assignment;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        int date =  Integer.parseInt(args[1]);
        if (month ==3 || 20 <= date || date <= 31) {
            System.out.println("this is Spring season date");
        } else if (month==4 || date <= 30) {
            System.out.println("this is Spring season date");
        }else if (month==5 || date <= 31) {
            System.out.println("this is Spring season date");
        }else if (month==6 || date <= 20) {
            System.out.println("this is Spring season date");
        }else {
            System.out.println("this is not Spring season date");
        }
    }
}
