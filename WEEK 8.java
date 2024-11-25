//WEEK 8.1
class FinalExample {
    final int maxSpeed = 120;
    public  final void displayMaxSpeed() {
        System.out.println("The maximum speed is: " + maxSpeed + " km/h");
    }
}
class SubClass extends FinalExample {
    public void showDetails() {
        System.out.println("This is a subclass of FinalExample.");
    }
}
class prog {
    public static void main(String[] args) {
        FinalExample obj = new FinalExample();
        obj.displayMaxSpeed();

        SubClass subObj = new SubClass();
        subObj.showDetails();
    }
}

//WEEK 8.2

import java.util.*;
class prog{
    public static void main(String ae[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String arr[] = new String[n];
        scan.nextLine();
        String str = scan.nextLine();
        String temp = "";
        int j=0;
        int l=str.length();
        for(int i = 0;i<l;i++){
            if(str.charAt(i)==' '){
                arr[j] = temp;
                temp ="";
                j++;
            }
            else{
                temp +=str.charAt(i); 
            }
        }
        arr[j] = temp;
        String s = "";
        char [] cha ={'a','A','e','E','i','I','o','O','U','u'};
        for(int i=0;i<n;i++){
            int c=0;
            char [] ar = arr[i].toCharArray();
            char ch1 = ar[0];
            char ch2 = ar[ar.length -1];
            for(char k : cha){
                if(k==ch1){
                    c++;
                }
                if(k==ch2){
                    c++;    
                }
            }
            if(c==2){
                s+=arr[i];
            }
        }
        if(s==""){
            System.out.print("no matches found");
        }
        else{
            System.out.print(s.toLowerCase());
        }
    }
}

//WEEK 8.3

import java.util.*;
abstract class Shape{
    abstract void calculatearea();
}
class Circle extends Shape{
    float rad;
    Circle(float rad){
        this.rad = rad;
    }
    void calculatearea(){
        System.out.format("Area of a circle: %.2f\n",3.14159*rad*rad);
    }
}
class Rectangle extends Shape{
    float l;
    float br;
    Rectangle(float l,float br){
        this.l = l;
        this.br = br;
    }
    void calculatearea(){
        System.out.format("Area of a Rectangle: %.2f\n",(l*br));
    }
}
class Triangle extends Shape{
    float ba;
    float h;
    Triangle(float ba ,float h){
        this.ba = ba;
        this.h = h;
    }
    void calculatearea(){
        System.out.format("Area of a Triangle: %.2f",0.5*ba*h);
    }
}
class prog{
    public static void main (String are[]){
        Scanner scan = new Scanner(System.in);
        float rad = scan.nextFloat();
        float l = scan.nextFloat();
        float br = scan.nextFloat();
        float ba = scan.nextFloat();
        float h = scan.nextFloat();
        Circle c = new Circle(rad);
        Rectangle r = new Rectangle(l,br);
        Triangle t = new Triangle(ba,h);
        c.calculatearea();
        r.calculatearea();
        t.calculatearea();
    }
}
