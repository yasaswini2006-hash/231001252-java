//WEEK 2.1

import java.util.Scanner;
public class Sequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(findNthTerm(n));
    }

    public static int findNthTerm(int n) {
        if (n == 1) return 0;
        if (n == 2 || n == 3) return 1;

        int[] sequence = new int[n];
        sequence[0] = 0;
        sequence[1] = 1;
        sequence[2] = 1;

        for (int i = 3; i < n; i++) {
            sequence[i] = sequence[i - 1] + sequence[i - 2] + sequence[i - 3];
        }

        return sequence[n - 1];
    }
}

//WEEK 2.2

import java.util.*;
class prog{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if(a<2||b<2){
            System.out.println("No");
        }
        else if(a>8||b>8){
            System.out.println("Yes");
        }
        else{
            System.out.println("Maybe");
        }
    }
}

//WEEK 2.3

import java.util.*;
class prog{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        boolean b = scan.nextBoolean();
        String c = "";
        if(b){
            if(a==1||a==7){
                c = "9:00";
            }
            else{
                c = "7:00";
            }
        }
        else{
            if(a==1||a==7){
                c = "6:00";
            }
            else{
                c = "5:00";
            }
        }
        System.out.println(c);
    }
}
