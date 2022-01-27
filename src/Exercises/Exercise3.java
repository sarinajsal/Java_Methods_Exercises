package Exercises;

public class Exercise3 {
    public static void main(String[] args) {

        /*Write a method which takes two numbers as arguments,
        checks if they are the same and returns the appropriate boolean value.
         You should check both possible outcomes here, i.e. that it returns true when it is
         supposed to and false when it is supposed to.
         */

        truNum(1, 2);
    }

    public static void truNum(int num1, int num2) {

        boolean check;
        check = num1 == num2;
        System.out.println(check);
    }
}
