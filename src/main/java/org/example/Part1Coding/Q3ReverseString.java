package org.example.Part1Coding;

public class Q3ReverseString {


    //3. Reverse a String: Write a function to reverse a given string. For example, given the input "Hello", the output should be "olleH".


    public static String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("Let's read this sentence backward!"));
        System.out.println(reverse("Hello"));
        System.out.println(reverse("I am here now"));
    }
}

