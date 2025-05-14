package com.oop.abstraction.polymorphism;

public class Insurance {
    //Concept name: method overloading
    public void insurancequote(String name){
        System.out.println("Single Insurance rate 80% discount");


    }



    public void insurancequote(String name1,String name2){
        System.out.println("Single Insurance rate 50% discount");


    }

    public void insurancequote(String name1, String name2, String name3){
        System.out.println("Single Insurance rate 20% discount");



    }
    public void insurancequote(String name1,String name2,String name3,String name4){
        System.out.println("Single Insurance rate 100% discount");


    }


}
