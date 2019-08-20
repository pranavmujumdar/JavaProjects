package com.pranavmujumdar;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //char has 16bits width as to store unicode you need 16bits or 2bytes
        //You cannot put more than two characters in the char try doing that and you'll know
        //Must use single quotes to declare the char
        //can even use the unicode value
        char myChar = 'D';
        char myUnicodeChar = '\u00A9';

        System.out.println(myChar);
        System.out.println(myUnicodeChar);
    }
}
