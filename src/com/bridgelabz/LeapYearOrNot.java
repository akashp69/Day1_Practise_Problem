package com.bridgelabz;

import java.util.Scanner;

public class LeapYearOrNot {
    /**
    *This Method Created For Checking The Year Is Leap Year Or Not a Leap Year
    */
    static void CheckLeapYear(){
    /**
    *Enter Year For Checking Given Year Is Leap Year Or Not a Leap Year
    */   
        int year;
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
    /**
    *Using If-else condition For Check year is leap Year Or Not Leap Year
    */
        if (((year % 4 ==0)&& (year % 100 != 0)) || (year % 400 ==0))
            System.out.println("Leap Year");
        else
            System.out.println("Not Leap Year");

    }
    /**
    *This Method Created For calling checkLeapYear Method 
    */

    public static void main(String[] args){
        System.out.println("Checking Leap Year or not");
        CheckLeapYear();


    }
}
