package org.example.Part1Coding;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    //9. Find the First Non-Repeating Character in a String:
    // Given a string, find and return the first non-repeating character.
    // For example, in the string "abracadabra", the first non-repeating character is 'c'.

    public static void main(String[] args) {
        String input = "abracadabra";
        Character result = findFirstNonRepeatingChar(input);

        if (result != null) {
            System.out.println("First non-repeating character: " + result);

        } else {
            System.out.println("No non-repeating character are found.");
        }

    }

    public static Character findFirstNonRepeatingChar(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }

        Map<Character, Integer> charCount = new LinkedHashMap<>();

        // Count occurrences of each character
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        //Find the first character with count 1
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return null; // No non-repeating character found
    }

}
