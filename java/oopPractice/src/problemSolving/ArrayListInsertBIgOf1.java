package problemSolving;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListInsertBIgOf1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        // Now you can use the 'list' variable as an ArrayList of integers
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("The list is: ");
        System.out.println(list);
        System.out.println("Do you want to insert a new value? Press 1 for yes, 0 for no: ");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        while (choice == 1) {
            System.out.println("Enter the new value: ");
            int newValue = input.nextInt();
            System.out.println("Enter the index number: ");
            int indexNumber = input.nextInt();
            if(indexNumber<list.size()) {

                System.out.println("Inserting value " + newValue + " at index " + indexNumber);
                List<Integer> newList = new ArrayList<>(list.subList(0, indexNumber));
                newList.add(newValue);
                newList.addAll(list.subList(indexNumber, list.size()));

                list = newList;  // Update the original list with the new list

                System.out.println("The new list is: ");
                System.out.println(list);
            }
            else {
                System.out.println("This index is not exiest");
            }

            System.out.println("Do you want to insert a new value? Press 1 for yes, 0 for no: ");
            choice = input.nextInt();
        }
    }
}
