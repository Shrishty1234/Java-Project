package com.oop.abstraction.polymorphism.Runtimepolymorphism;


//child class
public class Car extends Engine {
    @Override//this is called runtime polymorphism
    public void engineName(){
        System.out.println("Car name is BMW Car");




    }

     public void engineNames(){
         System.out.println("BMW Engine");



     }








}
