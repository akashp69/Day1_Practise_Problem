package com.bridgelabz;
 

public class DemoStaticMethod {
    static int staticvar;
  /**
  *This Method is Created For Give Demo Of Static Method
  */

    static void m1(){
        System.out.println("m1 Method");
    }
  /**
  *This Method is Created For Call the Method And Static Variable
  */

    public static void main(String[] args) {
  /**
  *Output is Static Variable And m1 Method  
  */
   

        System.out.println(staticvar);
        m1();
    }
}
