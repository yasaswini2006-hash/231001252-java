//WEEK 6.1
import java.util.*;

public class StringMergeSort {

    public static String mergeAndSort(String input1, String input2) {
        String concatenated = input1 + input2;
        Set<Character> uniqueChars = new HashSet<>();
        for (char ch : concatenated.toCharArray()) {
            if (ch != ' ') {
                uniqueChars.add(ch);
            }
        }
        List<Character> sortedList = new ArrayList<>(uniqueChars);
        Collections.sort(sortedList, Collections.reverseOrder());
        StringBuilder result = new StringBuilder();
        for (char ch : sortedList) {
            result.append(ch);
        }
        return result.length() > 0 ? result.toString() : "null";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();
        String result = mergeAndSort(input1, input2);
        System.out.println(result);
        scanner.close();
    }
}

//WEEK 6.2

import java.util.Scanner;

public class StringManipulation {
    public static char findChar(char ch1, char ch2) {
        if (ch1 == ch2) {
            return ch1;
        } else {
            int max = Math.max(ch1 - 'a' + 1, ch2 - 'a' + 1);
            int min = Math.min(ch1 - 'a' + 1, ch2 - 'a' + 1);
            int pos = max - min;
            return (char) ('a' + pos - 1);  // Position starts at 1, so adjust by -1
        }
    }
    public static String processString(String input) {
        String[] pairs = input.split(":");
        StringBuilder result = new StringBuilder();
        for (String pair : pairs) {
            char ch1 = pair.charAt(0);
            char ch2 = pair.charAt(1);
            result.append(findChar(ch1, ch2));
        }
        return result.toString().toUpperCase();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = processString(input);
        System.out.println( result);
        scanner.close();
    }
}


 //WEEk 6.3
import java.util.Scanner;

public class WordProcessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int number = sc.nextInt();
        String[] words = input.split(" ");
        int pos1 = number / 10; 
        int pos2 = number % 10; 
        pos1--;
        pos2--;
        String result1 = processWord(words[pos1]);
        String result2 = processWord(words[pos2]);
        String result = result1 + " " + result2;
        System.out.println(result);
    }
    private static String processWord(String word) {
        int len = word.length();
        int mid = len / 2;
        String middleToBegin;
        String middleToEnd;

        if (len % 2 == 0) {
            middleToBegin = new StringBuilder(word.substring(0, mid)).reverse().toString();
            middleToEnd = word.substring(mid);
        } else {
            middleToBegin = new StringBuilder(word.substring(0, mid + 1)).reverse().toString();
            middleToEnd = word.substring(mid);
        }
        return middleToBegin + middleToEnd;
    }
}
