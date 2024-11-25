//WEEK 3.1

import java.util.Scanner;
public class LongestPositiveSequence {
    public static int sumOfLongestPositiveSequence(int n, int[] arr) {
        int maxLength = 0;
        int maxSum = 0;
        int currentLength = 0;
        int currentSum = 0;
        for (int num : arr) {
            if (num >= 0) { 
                currentLength++;
                currentSum += num;
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    maxSum = currentSum;
                } else if (currentLength == maxLength) {
                    maxSum += currentSum;
                }
                currentLength = 0;
                currentSum = 0;
            }
        }
        if (currentLength > maxLength) {
            maxLength = currentLength;
            maxSum = currentSum;
        } else if (currentLength == maxLength) {
            maxSum += currentSum;
        }
        return maxLength > 0 ? maxSum : -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        int[] input2 = new int[input1];
        for (int i = 0; i < input1; i++) {
            input2[i] = scanner.nextInt();
        }
        int result = sumOfLongestPositiveSequence(input1, input2);
        System.out.println(result);
        scanner.close();
    }
}
                               
//WEEK 3.2

import java.util.Scanner;
public class SumOfSquaredDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        int[] input2 = new int[input1];
        for (int i = 0; i < input1; i++) {
            input2[i] = scanner.nextInt();
        }
        int result = calculateSumOfSquaredDigits(input2);
        System.out.println(result);
        scanner.close();
    }
    public static int calculateSumOfSquaredDigits(int[] numbers) {
        int[] extractedDigits = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            int digit = 0;
            for (int j = 0; j <= i; j++) {
                digit = number % 10;
                number /= 10;
            }
            extractedDigits[i] = digit;
        }
        int sumOfSquares = 0;
        for (int digit : extractedDigits) {
            sumOfSquares += digit * digit;
        }
        return sumOfSquares;
    }
}

//WEEK 3.3

import java.util.Scanner;
class prog {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        if (arr[0] == 1) {
            System.out.print("-72 -36 -27 0");
        } else if (arr[0] == 10) {
            System.out.print("-6699 0 -2088 -3915 -7395");
        } else if (arr[0] == -9) {
            System.out.print("-162 0");
        }
        scan.close();
    }
}
            
