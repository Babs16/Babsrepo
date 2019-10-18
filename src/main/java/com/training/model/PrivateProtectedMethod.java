package com.training.model;

import com.training.base.AddingMethods;

public class PrivateProtectedMethod extends AddingMethods {
    // methods and Variables can only accesed within the class
    private String data = "We are happy for ";
    private int event = 10;
    protected int run=65;
    protected String runner ="Good Horses";


    private void myPrivateMethod() {
        System.out.println(data + event);

   }

    protected void eventTest(){
        System.out.println(runner + " are "+ run);

    }

    public static void main(String[] args) {
        PrivateProtectedMethod hm = new PrivateProtectedMethod();
        hm.eventTest();
        hm.loans("Babs",20);

    }
}
//
//      class newBoy {
//    // why is it throwing error when I made this class public?
//
//
//        public static void main(String[] args) {
//            PrivateProtectedMethod hm = new PrivateProtectedMethod();
//            hm.eventTest();
//
//
//
//
//            //hm.myPrivateMethod();
//            // Above method cannot be accesed out of the class PrivateProtectd method
//
//        }
   // }

