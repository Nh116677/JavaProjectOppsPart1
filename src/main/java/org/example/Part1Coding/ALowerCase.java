package org.example.Part1Coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ALowerCase {
    //8.You have a list of strings and you want to keep only those that start with “A” and you want to return them in lower case".

    public static void main(String[] args) {
        List<String> inputList = Arrays.asList("Alphabet Chart", "Apple","Airplane", "Alarm Clock", "Art Supplies" );
        List<String> result= filterAndLowercase(inputList);
        System.out.println(result);
    }
    public static List <String> filterAndLowercase(List<String>list){
        List<String> filtered = new ArrayList<>();

        for (String str : list){
            if (str != null && !str.isEmpty() && str.toLowerCase().startsWith("a")){
                filtered.add(str.toLowerCase());
            }
        }
        return filtered;
    }
}
