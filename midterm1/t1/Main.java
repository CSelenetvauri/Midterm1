package midterm1.t1;

import java.util.ArrayList;
import java.util.List;

/**
 * The Main class demonstrates how to map integers from one list (list1)
 * to corresponding strings from another list (list2), based on the given rules.
 * The integers from list1 are used to index list2, but the indexing is 1-based.
 * The program generates a new list (list3) which stores the results of this mapping.
 * Finally, the contents of list3 are printed to the console.
 * Example:
 * list1 = {4, 2, 7, 3, 6, 1, 5, 8, 10, 9}
 * list2 = {"lnd", "vbq", "vsk", "lsd", "twe", "lyq", "oyu", "jom", "oay", "zjr", "zhu", "oxu"}
 * list3 will be generated as:
 * ["lsd", "vbq", "oyu", "vsk", "lyq", "lnd", "twe", "jom", "oxu", "zjr"]
 */
public class Main {

    /**
     * Executes the program logic. It initializes the lists,
     * processes the data, and prints the resulting list to the console.
     */
    public static void main(String[] args) {
        // Predefined values for list1 and list2
        int[] list1 = {4, 2, 7, 3, 6, 1, 5, 8, 10, 9}; // List of integers that will be used for indexing
        String[] list2 = {"lnd", "vbq", "vsk", "lsd", "twe", "lyq", "oyu", "jom", "oay", "zjr", "zhu", "oxu"}; // List of strings

        // List to store the results after processing list1
        List<String> list3 = new ArrayList<>();

        // Iterate over list1 and create list3 by picking strings from list2 based on the integers in list1
        for (int i = 0; i < list1.length; i++) {
            // Adjusting for 1-based index
            int index = list1[i] - 1;  // Subtract 1 to convert to 0-based index for list2
            if (index >= 0 && index < list2.length) {
                list3.add(list2[index]);  // Add the corresponding string to list3
            } else {
                list3.add("Invalid Index");  // In case of an invalid index
            }
        }

        // Prints the resulting list3
        System.out.println("List 3 : " + list3);
    }
}
