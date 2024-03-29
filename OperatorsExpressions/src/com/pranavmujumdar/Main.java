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


        //the use of ==
        boolean isBoy = false; //use small case to assign true or false values

        if(isBoy == false){ // we can also use !isBoy but baby steps!
                            // the == is the equality operator it matches the values
            System.out.println("Congratulations It's a Girl!");
        }

        //use of <,>,<=,>=
        /*  logical and is && single & is called "bitwise &" rarely used both the conditions have to be true
            logical or is || only one of the condition to be true
            it is good practice to put all the condition in parenthesis when using multiple conditions good readability
         */
        int score = 101;
        if(score==100){
            System.out.println("Top score!");
        }
        else if((score<100) && (score>=85)){
            System.out.println("High Performer");
        }
        else if((score<85) && (score>=70)){
            System.out.println("Good Perfomer");
        }
        else if(score>100 || score <0)
            System.out.println("invalid score");
        else {
            System.out.println("failed");
        }
    }
}
