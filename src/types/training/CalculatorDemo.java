package types.training;

import java.util.Scanner;

public class CalculatorDemo {

    public static void main(String[] args) {

        //built-in method called scanner

        Scanner input = new Scanner(System.in);
        System.out.println("Hi this is calculator");


        System.out.println("please enter an integer number");
         //int numberOne = input.nextInt();
       //  int numberOne = (int)input.nextDouble(); //casting
          double numberOne =input.nextDouble();


        System.out.println("Please enter another integer number");
          //int numberTwo= input.nextInt();
            double numberTwo = input.nextDouble();



          double result =numberOne +numberTwo;
           System.out.println("Final result ="+result);
    }










}
