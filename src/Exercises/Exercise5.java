package Exercises;

import java.sql.SQLOutput;

public class Exercise5 {
    public static void main(String[] args) {

        /*Write a method which takes a string as an argument, capitalises the first letter and returns the capitalised string.

HINT: The .toUpperCase() method will capitalise the whole string. Investigate how to split the first letter from the string,
capitalise that, then join the pieces back together
         */


        capitalize("hello");
        experiment("hi my name");


    }

    public static void capitalize(String str) {

        System.out.println(str.substring(0, 1).toUpperCase() + str.substring(1));


    }

    public static void experiment(String str2) {

        str2.split(" ");
        System.out.println(str2.substring(0, 1).toUpperCase() + str2.substring(1));

    }


}

