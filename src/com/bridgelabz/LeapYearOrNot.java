package com.bridgelabz;

import java.util.Scanner;

public class LeapYearOrNot {
    static void CheckLeapYear(){
        int year=1852;
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        if (((year % 4 ==0)&& (year % 100 != 0)) || (year % 400 ==0))
            System.out.println("Leap Year");
        else
            System.out.println("Not Leap Year");

    }

    public static void main(String[] args){
        System.out.println("Checking Leap Year or not");
        CheckLeapYear();


    }
}
