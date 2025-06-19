package org.example.Part1Coding;

import java.util.Arrays;
import java.util.Scanner;
public class Q5TwoStringAnagrams {

    // 5. Check if Two Strings are Anagrams: Given two strings, determine if they are anagrams, meaning they contain the same characters in a different order. For example, "listen" and "silent" are anagrams.
    public static boolean areAnagrams(String str1, String str2) {
        String s1 = str1.replaceAll("\\s+", "").toLowerCase();
        String s2 = str2.replaceAll("\\s+", "").toLowerCase();

        if (s1.length() != s2.length()) {
            return false;
        }

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1, chars2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String first = scanner.nextLine();

        System.out.println("Enter the second string");
        String second = scanner.nextLine();

        if (areAnagrams(first, second)) {
            System.out.println("\"" + first + "\" and \"" + second + "\" + are anagrams.");
        } else {
            System.out.println("\"" + first + "\" and \"" + second + "\" + are NOT anagrams.");
        }
        scanner.close();

        /*List of anagrams words  Cheater = teacher
        1. God = dog
        2. Planter = replant
        3.Lampshade = headlamps
        4.Bust = stub
        5.Roots = torso
        6.Rail = lair
        7.Donate = atoned
        8.Thicken = kitchen
        9.Iceman = anemic = cinema

         */
    }
}
