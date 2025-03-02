package org.example.Assignment1.com;

import java.util.LinkedList;

public class IterateLinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> stringList = new LinkedList<>();

        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");

        System.out.println("Elements in the LinkedList:");
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }

    }
}
