package com.example;
/**
    Write a short program that prints each number from 0 to 100
    on a new line.

    :For each multiples of 3, print "Fizz" instead of the number.

    :For each multiples of 5, print "Buzz" instead of the number.

    :For numbers which are multiples of both 3 and 5, print "FizzBuzz",
    instead of the number.

 
 */
public class App 
{
    public static void main( String[] args )
    {

        for (int i = 0; i <= 100; i++) {

           if ((i % 3 == 0) && (i % 5 == 0)) {
            System.out.println("FizzBuzz");
           } else if (i % 3 == 0) {
            System.out.println("Fizz");
           } else if (i % 5 == 0) {
            System.out.println("Buzz");
           } else {
            System.out.println(i);
           }

            
        }
    }
}
