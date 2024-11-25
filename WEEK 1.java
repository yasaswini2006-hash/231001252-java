//WEEK 1.1

import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println("1");
        }
        else{
            System.out.println("2");
        }
    }
}

//WEEK 1.2

import java.util.Scanner;
public class main{
    public static void main(String[] main){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=Math.abs(a);
        System.out.println(b%10);
    }
}

//WEEk 1.3

import java.util.Scanner;
public class main{
public static void main(String[] args){
    Scanner sc=new Scanner (System.in);
    int a=Math.abs(sc.nextInt());
    int b=Math.abs(sc.nextInt());
    int c=(a%10)+(b%10);
    System.out.println(c);
}
}
