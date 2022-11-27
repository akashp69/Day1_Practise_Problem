package com.bridgelabz;

import java.util.Scanner;

public class StringEquals {
    /**
    *This Method Created For Checking Both Strings Are Equal Or Not Equals
    */

    public static void main(String[] args) {

        System.out.println("Enter Any String Values For Checking String is Equal Or Not ");
        Scanner sc = new Scanner(System.in);
    /**
    *Using a variable for String One And b variable For String Two
    */

        System.out.println("Enter String 1 Value");
        String a =sc.next();
        System.out.println("Enter String 2 Value");
        String b =sc.next();
    /**
    *Using Equals Method and if-else condition For Compair Two Strings
    */

        if(a.equals(b)){
            System.out.println("Given String Are Equals");
        }
        else {

            System.out.println("Given String Are Not  Equals");
        }

    }
}
