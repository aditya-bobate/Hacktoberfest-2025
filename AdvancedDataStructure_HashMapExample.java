import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AdvancedDataStructure_HashMapExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a HashMap to store student names and their marks
        HashMap<String, Integer> studentMarks = new HashMap<>();

        System.out.println("Enter student names and marks (type 'done' to finish):");

        while (true) {
            System.out.print("Name: ");
            String name = sc.nextLine();
            if (name.equalsIgnoreCase("done")) break;

            System.out.print("Marks: ");
            try {
                int marks = Integer.parseInt(sc.nextLine());
                studentMarks.put(name, marks); // Add to HashMap
            } catch (NumberFormatException e) {
                System.out.println("Invalid marks, try again!");
            }
        }

        // Display all entries
        System.out.println("\nStudent marks:");
        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Search for a specific student
        System.out.print("\nEnter student name to search: ");
        String searchName = sc.nextLine();
        if (studentMarks.containsKey(searchName)) {
            System.out.println(searchName + "'s marks: " + studentMarks.get(searchName));
        } else {
            System.out.println(searchName + " not found.");
        }

        sc.close();
    }
}
