package com.pranavmujumdar;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //you can use _ to separate the number for better understanding
        int myValue = 10_000;

        //minimum and maximum values that can be stored as an Integer, 32 bit
        //Integer is the wrapper class
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println(myValue);
        System.out.println("Integer Min Value = " + myMinIntValue);
        System.out.println("Integer Max Value = " + myMaxIntValue);

        //try to add one more to the max value and we get the minimum int value Called overflow
        //try to remove one from the min value and we get the max int value called underflow
        System.out.println(myMaxIntValue + 1);
        System.out.println(myMinIntValue - 1);

        System.out.println("----------");
        System.out.println();

        //Let's try byte, smaller data type, 8 bits, so faster if its used
        System.out.println("Let's Try Byte");
        byte myMaxByteValue = Byte.MAX_VALUE;
        byte myMinByteValue = Byte.MIN_VALUE;
        System.out.println("Max Byte = " + myMaxByteValue);
        System.out.println("Min Byte = " + myMinByteValue);


        System.out.println("----------");
        System.out.println();

        //Let's try short, smaller data type, 16 bits, so faster if its used
        System.out.println("Let's Try Short");
        short myMaxShortValue = Short.MAX_VALUE;
        short myMinShortValue = Short.MIN_VALUE;
        System.out.println("Max Short = " + myMaxShortValue);
        System.out.println("Min Short = " + myMinShortValue);

        System.out.println("----------");
        System.out.println();

        //Let's try long, Bigger data type, 64 bits, so slower if its used
        //Use L at the end to declare it

        long myLongVariable = 2147483647_54654L;

        System.out.println("Let's Try Long");
        long myMaxLongValue = Long.MAX_VALUE;
        long myMinLongValue = Long.MIN_VALUE;
        System.out.println("Max Long = " + myMaxLongValue);
        System.out.println("Min Long = " + myMinLongValue);

        System.out.println("+++Casting+++");

        int myTotal = (myMaxIntValue/2);

        //here we had to specifically mention the output to be in byte otherwise it gives an error
        // try removing (byte)
        byte myNewByteValue = (byte) (myMaxByteValue/2);
        short myNewShortValue = (short) (myMinShortValue/2);


        System.out.println();
        System.out.println("Challenge");
        System.out.println("--------");

        int myInt = 35;
        byte myByte = 78;
        short myShort = 31757;

        Long myLong = 50000L + (10L * (myInt+myByte+myShort));

        System.out.println(myLong);

    }
}
