package org.example.Part1Coding;

import java.util.Scanner;

public class Palindrome {
    //4. Check if a String is Palindrome: Determine whether a given string is a palindrome, which means it reads the same forwards and backward. For example, "madam" is a palindrome.

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a word or phrase: ");
            String input = scanner.nextLine();

            // Remove spaces and convert to lowercase for accurate comparison
            String Input = input.replaceAll("\\s+", "").toLowerCase();
            String reversed = new StringBuilder(Input).reverse().toString();

            if (Input.equals(reversed)) {
                System.out.println("It's a palindrome!");
            } else {
                System.out.println("Not a palindrome.");
            }

            scanner.close();
        }
    }
