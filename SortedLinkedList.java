
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * A class that reads integers from input and stores them in a sorted LinkedList
 * Everything that I imported are examples of code reuse
 * I am reusing built-in sorting algorithms and data structures instead of recreating them
 * For example, instead of creating code to sort the numbers, I imported Collections and use the collections.sort() method
 */

public class SortedLinkedList {
    public static void main(String[] args) {
        // Create a LinkedList to store integers
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Create a Scanner object to read from the command line
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers (type 'done' to finish):");

        //Read integers from input until the user types "done"
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                // Add each integer to the LinkedList
                linkedList.add(scanner.nextInt());
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("done")) {
                    break;
                } else {
                    System.out.println("Please enter a valid integer or 'done' to finish ");
                }
            }
        }
        //Sort the LinkedList using the Collections framework
        Collections.sort(linkedList);

        // Output the sorted LinkedList
        System.out.println("Sorted List: " + linkedList);

        // Close the scanner
        scanner.close();
    }
    
}