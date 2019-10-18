package com.training.service;

import org.apache.logging.log4j.core.util.JsonUtils;

public class MasterCardBabs {

    // This class is being used to implement Non-Static variable and Methods.
    // This will require an object of the class to be created in order to call the methods and variables
    // Non Static variables cannot be referenced from a static context/method

     int a =10;
     String y = "This is my static example";
     int w = 15;
     int x = 30;
     int bb= 60;
     double br= 6.50;
     boolean th;
     int p =0;
     String Ir= "Move by Bloke";

// Static Variables (and methods) can be accessed directly from a static method. Non-Static variables Cannot be accessed from static method

    // Non static Method can be accessed from the Main class be creating an Object of the class
     void useNonStatic()
    {

        System.out.println(a +" " + y);
    }

    private  void cal(){
        int we= bb+x;
        System.out.println(we +" " + "This gives outcome for cal Non Static Method Cal");

    }

     void lookForNonStatic(){

        int c= w+x;
        System.out.println( c + " " + "This is for Non static Variable and Non static method");
    }

     static void lutonFc(){

         // Static methods lutonFc can still be referenced without using the object of the class because it is a static class

        System.out.println("Kenneyworth Road 10000");


    }
// OVERLOADING Concept
     public void overloading(int x){
        System.out.println("First Overloading ");
    }
     public void overloading(int x, int y){
        System.out.println("Second Overloading method");
     }
     public void overloading(String username, String pword){
         System.out.println(" Get username and Password");
     }
     public void overloading(String pword, int x){
         System.out.println(" Use valid password with the right int");
     }
     public void overloading(int time, double explain, int what){
         System.out.println("Use Base url");
     }

     // Exception Handling examples

    // There are 2 types of exceptions, Run time exception and Checked Exception

    // Checked Exception practice

    public void withdraw(int amount){
        System.out.println("Throw Exceptions and Catch same");


        try {
            int d = a/p;
        }
        catch(Exception e)
        {
            System.out.println("Catch it if you can");
        }

        finally {
            System.out.println("I cannot fail Babs");
        }


    }


    public static void main(String[] args) {
        MasterCardBabs mcb = new MasterCardBabs();
        mcb.useNonStatic();
        mcb.lookForNonStatic();
        lutonFc();
        mcb.cal();
        mcb.overloading("Babs","Password");
        mcb.overloading("Another Password", 20);
        mcb.withdraw(100);


    }
}
