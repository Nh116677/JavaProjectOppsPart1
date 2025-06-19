package org.example.Part1Coding;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Q10RemoveDuplicates {


    //10. How can you remove all duplicates from ArrayList?

    public static void main(String[] args) {
        List<String> removeListsDuplicates = new ArrayList<>();
        removeListsDuplicates.add("Pie");
        removeListsDuplicates.add("Chocolate bars");
        removeListsDuplicates.add("Ice-cream");
        removeListsDuplicates.add("Chocolate bars");
        removeListsDuplicates.add("Oranges juices");
        removeListsDuplicates.add("Chocolate ice-cream");

        List<String> ListWithoutDuplicate = duplicatesRemoved(removeListsDuplicates);
        System.out.println(ListWithoutDuplicate);

    }

    public static List<String> duplicatesRemoved(List<String> list) {
        return new ArrayList<>(new LinkedHashSet<>(list));
    }
}
