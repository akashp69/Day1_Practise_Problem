package com.bridgelabz;

public class CommandLineCount {
    /**
    *This Method is Created For Sum Of Arguments which is Pass in Commandline 
    */
    public static void main(String[] args) {
    /**
    * Pass Two Values  in  CommandLine Arguments 
    */

        System.out.println(args[0]);
        System.out.println(args[1]);

        int X = Integer.parseInt(args [0]);
        int Y = Integer.parseInt(args [1]);
    /**
    *Sum of Two Integers x and Y
    */

        int sum = (X+Y);
     /**
    *Print The Sum Of Two Numbers
    */
        
        System.out.println(sum);
    }
}
