//WEEK 11.1

import java.util.HashSet;
import java.util.Scanner;
public class HashSetCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            set.add(number);
        }
        while (scanner.hasNext()) {
            int checkNumber = scanner.nextInt();
            if (set.contains(checkNumber)) {
                System.out.println(checkNumber + " was found in the set.");
            } else {
                System.out.println(checkNumber + " was not found in the set.");
            }
        }
        
        scanner.close();
    }
}

//WEEK 11.2

import java.util.HashSet;
import java.util.Scanner;
public class SetComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        scanner.nextLine(); 
        HashSet<String> set1 = new HashSet<>();
        for (int i = 0; i < n1; i++) {
            set1.add(scanner.nextLine());
        }
        int n2 = scanner.nextInt();
        scanner.nextLine(); 
        HashSet<String> set2 = new HashSet<>();
        for (int i = 0; i < n2; i++) {
            set2.add(scanner.nextLine());
        }
        set1.retainAll(set2);
        for (String element : set1) {
            System.out.println(element);
        }

        scanner.close();
    }
}

//WEEK 11.3

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Scanner;
public class Prog {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        String name;
        int num;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            name = sc.next();
            num = sc.nextInt();
            map.put(name, num);
        }
        Set<Entry<String, Integer>> entrySet = map.entrySet();
        for (Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("----------");
        HashMap<String, Integer> anotherMap = new HashMap<String, Integer>();
        anotherMap.put("SIX", 6);
        anotherMap.put("SEVEN", 7);
        anotherMap.putAll(map);
        entrySet = anotherMap.entrySet();
        for (Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        map.putIfAbsent("FIVE", 5);
        int value = map.get("TWO");
        System.out.println(value);
        System.out.println(map.containsKey("ONE"));
        System.out.println(map.containsValue(3));
        System.out.println(map.size());
        sc.close();
    }
}
