package com.bridgelabz;

import java.util.Scanner;

public class StringEquals {


    public static void main(String[] args) {

        System.out.println("Enter Any String Values For Checking String is Equal Or Not ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String 1 Value");
        String a =sc.next();
        System.out.println("Enter String 2 Value");
        String b =sc.next();

        if(a.equals(b)){
            System.out.println("Given String Are Equals");
        }
        else {
            System.out.println("Given String Are Not  Equals");
        }

    }
}
