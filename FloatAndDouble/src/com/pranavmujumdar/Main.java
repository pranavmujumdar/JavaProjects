package com.pranavmujumdar;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //float is single precision 32bits
        //double is double precision 64bits
        // by default double is the floating point number

        System.out.println("-----float-----");
        float myMaxFloatValue = Float.MAX_VALUE;
        float myMinFloatValue = Float.MIN_VALUE;

        System.out.println("Min Float value: "+myMinFloatValue);
        System.out.println("Max Float value: "+myMaxFloatValue);

        System.out.println();
        System.out.println("-----double-----");

        double myMaxDoubleValue = Double.MAX_VALUE;
        double myMinDoubleValue = Double.MIN_VALUE;

        System.out.println("Min Double value: "+myMinDoubleValue);
        System.out.println("Max Double value: "+myMaxDoubleValue);


        int myIntValue = 22/7;
        //need to use cast to declare float use (float) or f at the end
        float myFloatValue = 22f/7f; //34.567f
        //double can be declared without casting
        double myDoubleValue = 22.0/7.0; //50.264E56 or 22d/7d
        System.out.println(myIntValue);
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);

        System.out.println();
        System.out.println("---");
        System.out.println("Exercise");
        System.out.println("---");

        System.out.println("program to convert Pounds to Kilograms");
        double myPounds = 200;

        double myKilograms = myPounds*0.45359237d;

        System.out.println(myPounds+" Pounds is "+myKilograms+" Kilograms.");

    }
}
