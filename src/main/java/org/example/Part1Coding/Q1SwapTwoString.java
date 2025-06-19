package org.example.Part1Coding;

public class Q1SwapTwoString {

        public static void main(String[] args) {

            //1. Write a program to swap 2 String without a temporary variable?

            String firstName = "Nhu";
            String lastName = "Nguyen";

            firstName = firstName + lastName;
            lastName = firstName.substring(0,firstName.length() - lastName.length());
            firstName = firstName.substring(lastName.length());
            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);

        }
    }



