import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class assgmnet2basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//
////        1.Write a program to print whether a
////        number is even or odd, also take input from the user.
//        System.out.println("Enter an integer");
//        int a = sc.nextInt();
//
//        if(a % 2 ==0)
//            System.out.println(a +" is even number");
//        else{
//
//            System.out.println(a + " is odd number");
//
//
////
//
//
//        }







//        Take name as input and print a greeting message
//    for that particular name.

            System.out.println("white your name ");
        String name = sc.next();
        if (Objects.equals(name, "Rohit"))
        //if(name = Rohit)

            System.out.println("happy birthday Rohit ");
        else{
            System.out.println("have a good day ");

        }


//        Write a program to input principal, time, and rate
//                (P, T, R) from the user and find Simple Interest.
//        s=p*r*t;


        // Print largest number
//        System.out.println("Enter the first number");
//        int number1 = sc.nextInt();
//        System.out.println("Enter second number");
//        int number2 = sc.nextInt();
//        if (number1 > number2)
//            System.out.println(number1 + " is largest than " + number2);
//        else {
//            System.out.println(number2 + " is largest than " + number1);
//        }








//        Input currency in rupees and output in USD.
//        System.out.println("enter the amount in rupees");
//        float input1 = sc.nextFloat();
//
//        float USD = (float) (input1 * 0.012);
//
//        System.out.println("Amount  in USD " + USD);


//
//       int n = 10, a = 0, b = 1;
//        System.out.println("Fibonacci Series till " + n+  "Terms:"  ) ;
//        for (int i = 1; i <  n; i++) {
//            System.out.println(a + " ,");
//
//            int c = a + b;
//            a = b;
//            b= c;


        int n , a = 0 , b = 0 ,c = 1;
        System.out.println("ENter value of n");

        n = sc.nextInt();
        System.out.println("fabonacci Series");
        for (int i = 1; i <=n ; i++) {
            a=b;
            b=c;
            c = a +b ;
            System.out.println(a + " ");


        }







//        To find out whether the given String is Palindrome or not.
//            String str = sc.next();
//           String reverseStr ="";
//
//            int strLength = str.length();
//
//        for (int i = (strLength - 1); i >= 0; --i) {
//
//            reverseStr = reverseStr + str.charAt(i);
//
//
//
//        }
//        if(str.toLowerCase().equals(reverseStr.toLowerCase())){
//            System.out.println(str + " is a palindrome String");
//
//        }
//        else {
//            System.out.println(str + " is not a palindrome string");
//        }













//        System.out.println("Enter the first number:");
//        int num1 = sc.nextInt();
//        System.out.println("Enter the second number:");
//        int num2 = sc.nextInt();
//
//        for (int i = num1   ; i < num2; i++) {
//            int check ,rem , sum = 0;
//            check = i;
//            while ( check != 0)  {
//                rem = check % 10;
//                sum = sum + (rem * rem * rem);
//                check = check /10;
//
//
//            }
//            if (sum == i ){
//                System.out.println("" + i + " is an Armstrong number");
//            }
//
//        }
//





        }












    }

