package types.training;

public class CastingDemo {

    public static void main(String[] args) {

        //Implicit casting/automatic
        // has to be compatible type
        //byte -> short -> int->    long -> float -> double
        // 1   ->    2  ->    4     ->    8


        short x =1;
        int y = x+2;
       // System.out.println(y);

        long a = 8l;
        float b =a+ 2;
       // System.out.println(b);




        //Explicit casting / not  automatic
         double k = 1.1;
         double z =(int)k+2; // forcefully coverted to int by using ()brackets
       // System.out.println(z);

        double g = 2.1;
        double h =(long) g+3;
        System.out.println(h);



        //Wrapper Class
       // String myString ="1.1";
       // double myDouble = Double.parseDouble(myString) +2;
       // System.out.println(myDouble);


     // String myString ="45";
      //int myInt = Integer.parseInt(myString)+2;
      //  System.out.println(myInt);


        String myString ="90";
        long myLong = Long.parseLong(myString)+2;
        System.out.println(myLong);

          //for wrapper class we use the built-in java code/function
          // "parse"


    }















}
