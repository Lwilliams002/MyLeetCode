package LeetCode75.Linked;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.HashMap;
public class Node {
    public static void main(String[] args) {
        LinkedList<Integer> Node = new LinkedList<Integer>();
        for (int i = 0; i < 6; i++)
            Node.addLast(i);
        ListIterator<Integer> node = Node.listIterator();


        while (node.hasNext())
            System.out.print(node.next() + (node.hasNext() ? " -> " : "\n"));

        while (node.hasPrevious()) {
            node.previous();
            if (node.hasPrevious()) {
                node.previous();
                node.remove();
            }
        }


        int count = 1;
        for (int number : Node)
            System.out.print(count + ": " + number + (count++ < Node.size() ? " -> " : ""));



// Declaration and initialization of an ArrayList
        ArrayList<String> stringList = new ArrayList<>();

// Adding elements to the ArrayList
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");

// Accessing elements of the ArrayList
        System.out.println("ArrayList Element at index 1: " + stringList.get(1));

        // Declaration and initialization of an array
        int[] integerArray = new int[5];

// Assigning values to the array elements
        integerArray[0] = 10;
        integerArray[1] = 20;
        integerArray[2] = 30;
        integerArray[3] = 40;
        integerArray[4] = 50;

// Accessing elements of the array
        System.out.println("Array Element at index 2: " + integerArray[2]);




// Declaration and initialization of a LinkedList
        LinkedList<Double> doubleLinkedList = new LinkedList<>();

// Adding elements to the LinkedList
        doubleLinkedList.add(3.14);
        doubleLinkedList.add(2.71);
        doubleLinkedList.add(1.618);

// Accessing elements of the LinkedList
        System.out.println("LinkedList Element at index 0: " + doubleLinkedList.get(0));



// Declaration and initialization of a HashMap
        HashMap<String, Integer> ageMap = new HashMap<>();

// Adding key-value pairs to the HashMap
        ageMap.put("Alice", 25);
        ageMap.put("Bob", 30);
        ageMap.put("Charlie", 22);

// Accessing values using keys in the HashMap
        System.out.println("Age of Bob: " + ageMap.get("Bob"));

    }
}