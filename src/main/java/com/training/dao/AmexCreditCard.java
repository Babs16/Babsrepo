package com.training.dao;

public class AmexCreditCard {

    static int a =10;
    static String y = "This is my static example";
    static int w = 15;
    static int x = 30;
    static int bb= 60;
    static double br= 6.50;
    static boolean th;
    static String Ir= "Move by Bloke";

// Static Variables (and methods) can be accessed directly from a static method. Non-Static variables Cannot be accessed from static method

    // Non static Method can be accessed from the Main class be creating an Object of the class
    static void useStatic()
    {
        System.out.println(a +" " + y);
    }

    private static void cal(){
        int we= bb+x;
        System.out.println();

    }

    static void lookForNonStatic(){

        int c= w+x;
        System.out.println( c + " " + "This is for Non static Variable and Non static method");
    }

     static void lutonFc(){

        System.out.println("Kenneyworth Road");



    }




    public static void main(String[] args) {

        useStatic();
        AmexCreditCard ACC = new AmexCreditCard();
        ACC.lookForNonStatic();
        lookForNonStatic();
        lutonFc();
        cal();


    }

}
