package Exercises;

public class Exercise4 {
    public static void main(String[] args) {

        /*Write a method which takes two numbers as arguments and prints one of:

    "The first number is larger"
    "The second number is larger"
    "The numbers are equal"
    as appropriate.*/


        numSize(3, 2);

    }

    public static void numSize(int num1, int num2) {

        if (num1 == num2) {
            System.out.println("The numbers are equal");

        } else if (num1 > num2) {
            System.out.println("The first number is larger");
        } else if (num1 < num2) {
            System.out.println("The second number is larger");
        }
    }
}
