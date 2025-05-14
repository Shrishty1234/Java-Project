package types.training;

public class CastingPRacticeandWrapper {
    public static void main(String[] args) {

      //Implicit and automatic = both should be compatible
      // byte -> short-> int -> long ->float -> double
      // 1    -> 2     ->4    ->8     ->4    ->8



        double x = 1.1;
         double y = x+2;
       // System.out.println(y);

        //Explicit Casting / not automatic
        double k=1.1;
        int z = (int)k+2;
        System.out.println(z);



        //Wrapper Class
        // int -> Integer Long -> Long short -> Short,double -> Double
       // String myString ="1.1";
       //double myDouble = myString +2;
       // double myDouble = Double.parseDouble(myString)+2;
       /// String myString ="48";
       // int myInt = Integer.parseInt(myString)+2;
       // System.out.println(myInt);
       // System.out.println(myDouble);


        String myString ="32";
        Long myLong = Long.parseLong(myString)+3;
        System.out.println(myLong);

    }











}
