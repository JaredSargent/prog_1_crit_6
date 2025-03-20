package student;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create ArrayList to store 10 Student objects
        ArrayList<Student> students = new ArrayList<>();

        // Add 10 students
        students.add(new Student(101, "Emma", "123 Maple St"));
        students.add(new Student(105, "Liam", "456 Oak Ave"));
        students.add(new Student(103, "Olivia", "789 Pine Rd"));
        students.add(new Student(108, "Noah", "321 Birch Ln"));
        students.add(new Student(102, "Ava", "654 Cedar Dr"));
        students.add(new Student(107, "Sophia", "987 Elm St"));
        students.add(new Student(104, "Jackson", "147 Spruce Way"));
        students.add(new Student(109, "Isabella", "258 Willow Ct"));
        students.add(new Student(106, "Mason", "369 Ash Blvd"));
        students.add(new Student(110, "Mia", "741 Poplar St"));

        // Print unsorted list
        System.out.println("Unsorted Students:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sort by name using custom selection sort
        System.out.println("\nStudents Sorted by Name:");
        SortUtil.selectionSort(students, new NameComparator());
        for (Student s : students) {
            System.out.println(s);
        }

        // Sort by rollno using custom selection sort
        System.out.println("\nStudents Sorted by Roll Number:");
        SortUtil.selectionSort(students, new RollnoComparator());
        for (Student s : students) {
            System.out.println(s);
        }
    }
}