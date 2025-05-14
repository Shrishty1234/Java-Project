package com.java.practice;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;

public class FormatNumber {

    public static void main(String[] args) {

//     NumberFormat currency = NumberFormat.getCurrencyInstance();
//     String resultCurrency= currency.format(1234567);// this is called expression
//        System.out.println(resultCurrency);


       NumberFormat currency = NumberFormat.getPercentInstance();
       String resultCurrency = currency.format(1234567);
        System.out.println(resultCurrency);


    }










}
