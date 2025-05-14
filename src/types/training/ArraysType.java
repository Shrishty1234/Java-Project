package types.training;

import java.util.Arrays;

public class ArraysType {

    public static void main(String[] args) {
        //this is a fixed array. this is a old syntex
        int[] age = new int[5];
        age[0] =1;
        age[1]=2;
        age[3] =3;

        //Arrays.toString(age);
       // System.out.println(Arrays.toString(age));
        String [] message = new String[2];
        message[1] ="Shrishty";
        System.out.println(Arrays.toString(message));

        boolean[] isColdToday = new boolean[2];
        isColdToday[1]= false;
        System.out.println(Arrays.toString(isColdToday));


    //modern way array
        int[] listOFnumbers ={1,2,3,5,6};
       // System.out.println(Arrays.toString(listOFnumbers));
        System.out.println(listOFnumbers.length);



    }










}
