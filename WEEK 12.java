//WEEK 12.1

import java.util.Scanner;
public class DecodeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String encoded = sc.nextLine();
        System.out.println( decode(encoded));
        sc.close();
    }
    public static String decode(String encoded) {
        String[] zeroGroups = encoded.split("1");
        StringBuilder decodedWord = new StringBuilder();
        for (String group : zeroGroups) {
            if (group.length() > 0) {
                char letter = (char) ('Z' - (group.length() - 1));
                decodedWord.append(letter);
            }
        }
        return decodedWord.toString();
    }
}

//WEEK 12.2

import java.util.Scanner;
public class WordReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        int caseOption = sc.nextInt();
        String result = reverseWords(sentence, caseOption);
        System.out.println(result);
        sc.close();
    }
    public static String reverseWords(String sentence, int case_option) {
        String[] words = sentence.split(" ");
        StringBuilder modifiedSentence = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            StringBuilder reversedWord = new StringBuilder();
            for (int j = word.length() - 1; j >= 0; j--) {
                reversedWord.append(word.charAt(j));
            }
            if (case_option == 1) {
                for (int j = 0; j < word.length(); j++) {
                    char originalChar = word.charAt(j);
                    char reversedChar = reversedWord.charAt(j);

                    if (Character.isUpperCase(originalChar)) {
                        reversedWord.setCharAt(j, Character.toUpperCase(reversedChar));
                    } else if (Character.isLowerCase(originalChar)) {
                        reversedWord.setCharAt(j, Character.toLowerCase(reversedChar));
                    }
                }
            }
            modifiedSentence.append(reversedWord);
            if (i < words.length - 1) {
                modifiedSentence.append(" ");
            }
        }
        return modifiedSentence.toString();
    }
}

//WEEK 12.3

import java.util.Scanner;
public class CommonAlphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        sc.close();
        char[] array1 = input1.replace(" ", "").toCharArray();
        char[] array2 = input2.replace(" ", "").toCharArray();
        int sum1 = 0;
        for (char c1 : array1) {
            for (char c2 : array2) {
                if (c1 == c2) {
                    sum1 += (int) c1;
                    break;
                }
            }
        }
        int singleDigitSum = getSingleDigitSum(sum1);
        System.out.println(singleDigitSum);
    }
    private static int getSingleDigitSum(int number) {
        while (number >= 10) {
            int sum = 0;
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }
            number = sum;
        }
        return number;
    }
}
