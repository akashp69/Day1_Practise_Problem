package com.bridgelabz;

public class CommandLineCount {
    public static void main(String[] args) {

        System.out.println(args[0]);
        System.out.println(args[1]);

        int X = Integer.parseInt(args [0]);
        int Y = Integer.parseInt(args [1]);

        int sum = (X+Y);
        
        System.out.println(sum);
    }
}
