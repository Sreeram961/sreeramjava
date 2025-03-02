package org.example.Assignment1.com;

import java.util.LinkedList;

public class RemoveElementExample {
    public static void main(String[] args) {
        LinkedList<String> stringList = new LinkedList<>();

        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");
        stringList.add("Elderberry");

        System.out.println("LinkedList before removal: " + stringList);

        if (stringList.size() >= 3) {
            String removedElement = stringList.remove(2);
            System.out.println("Removed element: " + removedElement);
        } else {
            System.out.println("The LinkedList does not have enough elements to remove the third one.");
        }

        System.out.println("LinkedList after removal: " + stringList);
    }
}
