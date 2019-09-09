package com.pranavmujumdar;

public class Main {

    public static void main(String[] args) {

        /*all the data types
            i. byte
            ii. short
            iii. int
            iv. long
            v. float
            vi. double
            vii. char
            viii. boolean

            mostly used will be int, double, boolean

         */


        //String is not a Data type it's a Fucking Class, String is a sequence of characters,
        // it could contain a single character(regular or unicode) or it could contain a sequence as well
        // max value of string is 2.14 Billion

        String myStringUnicode = "\u0040"; //refer the unicode table to get the value of the unicode unicode-table.com
        String myString = "Sequence of characters and numbers 4841148sdf7f";

        // to append strings you can use the + operator
        System.out.println("appended "+myStringUnicode);
        System.out.println(myStringUnicode);
        System.out.println(myString);
        //when trying to append one string and one int it will append
        String thisAString = "50";
        int num = 10;
        thisAString = thisAString + num;
        System.out.println("trying to append num and a string "+ thisAString);

        //let's try adding a double number to thisAstring now
        double doubleNum = 125.45d;
        thisAString = thisAString + doubleNum;
        System.out.println("trying to append num and a string "+ thisAString);

        //Strings
        //Strings notice the capital S
        /*Strings in java are immutable if you delete or append characters out/to of a string
            A new string object is created by java everytime we try to edit or delete chr out of a string
            in the above code the numbers and double wasnt appended to the thisAString variable but a new string was
            created and the old one was discarded by java
            The above code is inefficient and is discouraged and it is recommended to use StringBuffer
         */
    }
}
