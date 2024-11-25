//WEEK 9.1
import java.util.*;
class prog{
    public static void main(String a[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        try{
            int aa=arr[0]/arr[1];
            arr[n]=2;
        }
        catch (ArithmeticException ae){
            System.out.println(ae);
        }
        catch(ArrayIndexOutOfBoundsException op){
            System.out.println(op);
        }
        finally{
            System.out.print("I am always executed");
        }
        
    }
}

//WEEK 9.2

class prog {
  public static void main(String[] args) {
    int n = 82;
    trynumber(n);
    n = 37;
    // call the trynumber(n);
    trynumber(n);
    
    
  }

  public static void trynumber(int n) {
    try {
        //call the checkEvenNumber()
        checkEvenNumber(n);
      System.out.println(n + " is even.");
    } catch (RuntimeException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  public static void checkEvenNumber(int number) {
    if (number % 2 != 0) {
      throw new RuntimeException(number + " is odd.");
    }
  }
}

//WEEK 9.3

import java.util.Scanner;
import java.util.InputMismatchException;
 class prog {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    int length = sc.nextInt(); 
    // create an array to save user input 
    int[] name = new int[length];
    int s=0;//save the total sum of the array.
     
    /* Define try-catch block to save user input in the array "name"
   If there is an exception then catch the exception otherwise print 
   the total sum of the array. */ 
     try
      {
          for(int i=0;i<length;i++){
              name[i]=sc.nextInt();
              s+=name[i];
          }
            System.out.print(s);
         }
      catch( InputMismatchException e)
     {
         System.out.print("You entered bad data.");

    }
 }
}
