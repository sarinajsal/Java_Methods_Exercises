package Exercises;

public class Exercise2 {
    public static void main(String[] args) {


        //Write a method which takes a number as an argument and returns that number negated,
        // e.g. passing 5 as an argument should return -5; passing -10 should return 10.

        negated(-5);
    }

    public static void negated(int number) {

        number = number * (-1);
        System.out.println(number);

    }
}
