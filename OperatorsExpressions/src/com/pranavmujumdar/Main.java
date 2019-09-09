package com.pranavmujumdar;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*there are multiple operators like
        i. + (addition/append)
        ii. - (subtraction)
        iii. * (multiplication)
        iv. / (division)
        v. % (modulo, gives reminder)
        vi. = (assignment operator, value on right is assigned to the variable on left )
         */
        int result = 1+6; // 1 and 6 are the oprands
        System.out.println(result);
        result = result - 2; //here value on right goes back to update the value of variable result
        System.out.println(result);
        result = result*4;
        System.out.println(result);
        result = result/2;
        System.out.println(result);
        result = result/3;
        System.out.println(result);

        //abbreviated forms of common operators

        result++; // same as doing result = result+1 or result+=1
        System.out.println(result);
        result+=2; //same as doing result = result + 2
        System.out.println(result);
        result--; // same as result = result-1
        System.out.println(result);
        result-=2; // same as result = result -2;
        System.out.println(result);

        result *=10; //same as result = result*10
        System.out.println(result);

        result /=5; //same as doing result = result/5
        System.out.println(result);




    }
}
