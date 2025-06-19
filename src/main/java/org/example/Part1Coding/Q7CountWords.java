package org.example.Part1Coding;

public class Q7CountWords {

    //7. Count the Number of Words in a String:
    // Write a function to count the number of words in a given string.
    // Words are separated by spaces or punctuation.
    // For example, the input "Hello, world!" should return 2.

        public static void main(String[] args) {
            String input = "Hello, world!";
            int wordCount = countWords(input);
            System.out.println("Number of words: " + wordCount);
        }

        public static int countWords(String str) {
            if (str == null || str.trim().isEmpty()) {
                return 0;
            }

            // Split based on non-word characters (regex: [^a-zA-Z0-9_]+)
            String[] words = str.trim().split("[\\W_]+");

            return words.length;
        }
    }
