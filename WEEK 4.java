//WEEK 4.1

public class Student {
    private String name;
    private int rollNo;
    public Student() {
        this.name = null;
        this.rollNo = 0;
        System.out.println("No-arg constructor is invoked");
    }
    public Student(String name) {
        this.name = name;
        this.rollNo = 0;
        System.out.println("1 arg constructor is invoked");
    }
    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        System.out.println("2 arg constructor is invoked");
    }
    public void displayInfo() {
        System.out.println("Name =" + name + " , Roll no = " + rollNo);
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("Rajalakshmi");
        Student student3 = new Student("Lakshmi", 101);
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
    }
}

//WEEK 4.2

import java.io.*;
import java.util.Scanner;
class Circle
{
    private double radius;
    public Circle(double radius){
        // set the instance variable radius
       this.radius=radius;
    }
    public void setRadius(double radius){
        // set the radius
       this.radius=radius;
        
    }
    public double getRadius()    {
        // return the radius
       return radius;
        
    }
    public double calculateArea()  { // complete the below statement
       return Math.PI*radius*radius;
        
    }
    public double calculateCircumference()    { 
        // complete the statement
       return  2*Math.PI*radius;
    }
}
class prog{
    public static void main(String[] args)  {
        int r;
        Scanner sc = new Scanner(System.in);
        r=sc.nextInt();
        Circle c= new Circle(r);
        System.out.println("Area = "+String.format("%.2f", c.calculateArea()));
        System.out.println("Circumference = "+String.format("%.2f",c.calculateCircumference()));
    }
}

//WEEK 4.3

public class Mobile {
    private String manufacturer;
    private String operating_system;
    public String color;
    private int cost;
    public Mobile(String manufacturer, String operating_system, String color, int cost) {
        this.manufacturer = manufacturer;
        this.operating_system = operating_system;
        this.color = color;
        this.cost = cost;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setOperatingSystem(String operating_system) {
        this.operating_system = operating_system;
    }
    public String getOperatingSystem() {
        return operating_system;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }
    @Override
    public String toString() {
        return  "manufacturer = " + manufacturer + '\n' +"operating_system = " + operating_system + '\n' +"color = " + color + '\n' +"cost = " + cost;
    }
    public static void main(String[] args) {
        Mobile mobile = new Mobile("Redmi", "Andriod", "Blue", 34000);
        System.out.println(mobile);
    }
}
