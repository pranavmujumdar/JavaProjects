package com.pranavmujumdar;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int x =12345;
        int a = 0;
        do{
            a += x%10;
            x = x/10;
        }while(x>0);
        System.out.println(a+x);
    }
}
