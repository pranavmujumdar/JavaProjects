package com.pranavmujumdar;
import java.lang.Math;
import java.util.*;


public class Main {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int N = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//        if (N%2==0){
//            if (N>=2 && N<=5){
//                System.out.println("Not Weird");
//            }
//            if (N>=6 && N<=20){
//                System.out.println("Weird");
//            }
//            if (N>20)
//                System.out.println("Not Weird");
//        }
//        else
//            System.out.println("Weird");
//        scanner.close();
//
//        int i = scanner.nextInt();
//        double d = scanner.nextDouble();
//        scanner.nextLine();
//        String s = scanner.nextLine();
//
//        System.out.println("String: " + s);
//        System.out.println("Double: " + d);
//        System.out.println("Int: " + i);
//
/*
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            //Complete this line
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");
*/

/*
            int N = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            for (int i=0; i<=10; i++){
                System.out.printf("%d x %d = %d\n",N,i,i*N);
            }
            scanner.close();
*/
/*
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int result = 0;
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for(int j = 0; j<n;j++) {
                a = (a + (int) (Math.pow(2, j) * b));
                System.out.print(a+"\t");
            }

        }
        System.out.println();
        in.close();
*/
/*
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                //Complete the code
                if(x>= Short.MIN_VALUE && x <= Short.MAX_VALUE) System.out.println("* short");
                if(x>= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) System.out.println("* int");
                if(x>= Long.MIN_VALUE && x<= Long.MAX_VALUE) System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }

 */
/*
        Scanner sc = new Scanner(System.in);
            for(int i=1; sc.hasNext()==true; i++){
                System.out.println(i+" "+sc.nextLine());
            }

 */


    }
}