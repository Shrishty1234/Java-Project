package types.training;

public class MathPractice {
    public static void main(String[] args) {

       // int result = Math.round(3.1F);
       // int result = Math.ceil();
        //System.out.println(result);


      //round demo
        int result =(int) Math.round(1.1F);
        System.out.println(result);

     //ceil
        int result1 =(int)Math.ceil(2.1F);
        System.out.println(result1);

        //Floor
        int result2 =(int)Math.floor(2.3F);
        //System.out.println(result2);
        System.out.println("floor concept =" +result2);

        //max
        int result3 =(int)Math.max(35,45);
        System.out.println(result3);

        //min
        int result4 =(int)Math.min(567,763);
        System.out.println(result4);


        //random
        double result5 = Math.random();
        System.out.println(result5);

        //round random
        int result6 = (int)Math.round(Math.random()*65);
        System.out.println(result6);

          //explicit casting - narrowing
        int ab =(int) Math.ceil(2.1);
        System.out.println(ab);















    }









}
