package com.training.base;


import com.training.model.PrivateProtectedMethod;

public class AddingMethods  {

    // Constructor OVERLOADING approaching considers the number of parameters and Data types as below
    // We call these CONSTRUCTORS by creating an object of the class an call the right the constructor

    // We have commented out the constructors below as it is displaying error in the PrivateProtectedMethod class where the AddingMethods class is Extented because there is no "default constructor

//    AddingMethods(int bal,int paidin,String ac_holder)
//    {
//        System.out.println(bal+paidin+ac_holder);
//
//    }
//
//    AddingMethods(int bal,int paidin)
//    {
//        System.out.println(bal+paidin);
//
//    }
//
//    AddingMethods(int bal,String ac_holder)
//    {
//        System.out.println(bal+ac_holder);
//
//    }


    protected int bal = 250;
    protected int paidin = 1600;
    protected String ac_holder = "Mr Biggs";

    protected void loans(String customerName, int amount)

    {
        String Creditscore;
        if (amount >= 1000) {
            Creditscore = "Good";
        }
        else if (amount<=500){
            Creditscore="Poor";
        }
        else if (amount ==750){
            Creditscore="Above Average";
        }
        else {
            Creditscore ="Problematic";
        }

        System.out.println("Credit Score for Customer " + customerName +" is: "+ Creditscore);
    }
// Polymorphorsim is a concept which uses OVERLOADING and Overriding as approach ( Using the same Method with different number parameters and or data type
    // Overloading concept can be applied to both CONSTRUCTOR and METHOD as seen  below
    void loadEvent(int a, int b)
    {
        System.out.println(a+b);
    }

    void loadEvent(String s, int c)
    {
        System.out.println(s + c);
    }

    void loadEvent(double s, int c)
    {
        System.out.println(s + c);
    }
    void loadEvent(String s, String c)
    {
        System.out.println(s + c);
    }

    void loadEvent(String s, String c,int d)
    {
        System.out.println(s + c +d);
    }




    //public static void main(String[] args) {
      //  loans("Amrit", 200);
    //}

   // AddingMethods addmet = new AddingMethods();
    // why is it asking for a Getter/Setter Methods here as I have extended the PPM Class?




}