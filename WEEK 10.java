//WEEK 10.1
import java.util.ArrayList;
import java.util.Scanner;
public class FirstLastElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            arrayList.add(scanner.nextInt());
        }
        if (!arrayList.isEmpty()) {
            Integer firstElement = arrayList.get(0);
            Integer lastElement = arrayList.get(arrayList.size() - 1);
            System.out.println("ArrayList: " + arrayList);
            System.out.println("First : " + firstElement + ", Last : " + lastElement);
        } else {
            System.out.println("The ArrayList is empty.");
        }
        scanner.close();
    }
}

//WEEK 10.2

import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Prog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++)
            list.add(sc.nextInt());
        // printing initial value ArrayList
        System.out.println("ArrayList: " + list);
        // Replacing the element at index 1 with 100
        if (list.size() > 1) {
            list.set(1, 100); // code here
        }
        // Getting the index of first occurrence of 100
        System.out.println("Index of 100 = " + list.indexOf(100)); // code here
        // Getting the index of last occurrence of 100
        System.out.println("LastIndex of 100 = " + list.lastIndexOf(100)); // code here
        // Check whether 200 is in the list or not
        System.out.println(list.contains(200)); // Output : false
        // Print ArrayList size
        System.out.println("Size Of ArrayList = " + list.size()); // code here
            // Inserting 500 at index 1
        list.add(1, 500); // code here
        // Removing an element from position 3
        if (list.size() > 3) {
            list.remove(3); // code here
        }
        System.out.print("ArrayList: " + list);
    }
}

//WEEK 10.3

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
         int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            arrayList.add(scanner.nextLine());
        }
        System.out.println("List before reversing :");
        System.out.println(arrayList);
        Collections.reverse(arrayList);
        System.out.println("List after reversing :");
        System.out.println(arrayList);
        scanner.close();
    }
}
