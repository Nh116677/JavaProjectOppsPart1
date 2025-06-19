package org.example.Part1Coding;

public class Q2alphaCharacters {

    public static int NumberOfAlphaCharacter(String input) {
        //3. Reverse a String: Write a function to reverse a given string. For example, given the input "Hello", the output should be "olleH".


        int count = 0;
        for (char character : input.toCharArray()) {
            if (Character.isLetter(character)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(NumberOfAlphaCharacter("I am working on Java Project (Opps) Part 1"));
        System.out.println(NumberOfAlphaCharacter("I am practicing Java Project"));
        System.out.println(NumberOfAlphaCharacter("password123456"));

    }


}




