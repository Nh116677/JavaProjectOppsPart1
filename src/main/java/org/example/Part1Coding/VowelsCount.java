package org.example.Part1Coding;

public class VowelsCount {

    //6. Create a method to count how many vowels are present in a string “documentation”
    public static void main(String[] args) {
        String input = "documentation";
        int numVowels = countVowels(input);
        System.out.println("Number of vowels in \"" + input + "\": " + numVowels);
    }

    public static int countVowels(String str) {
        int count = 0;
        String vowels = "documentation";

        for (int i = 0; i < str.length(); i++) {
            // Convert character to lowercase for case-insensitive comparison
            char ch=Character.toLowerCase(str.charAt(i));
            if (vowels.indexOf(ch) != -1) {
                count++;

        }

        }
        return count;
    }

}
