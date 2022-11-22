package com.bridgelabz;

public class DemoStaticMethod {
    static int staticvar;

    static void m1(){
        System.out.println("m1 Method");
    }

    public static void main(String[] args) {

        System.out.println(staticvar);
        m1();
    }
}
