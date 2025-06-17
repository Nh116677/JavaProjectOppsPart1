package org.example.Part1Coding;

public class alphaCharacters {

    public static int NumberOfAlphaCharacter(String input) {
        //2. Find out how many alpha characters are present in a string?

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




