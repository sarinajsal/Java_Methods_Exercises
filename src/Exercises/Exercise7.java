package Exercises;

public class Exercise7 {



    public int numberOfWords(String string){

        String [] words = string.split("\\s+");
        System.out.println(words.length);
        return words.length;
    }

}
