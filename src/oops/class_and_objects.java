
package oops;
/*
class Student{
    String name;
    int age;


    void study(){
       System.out.println(name+" is studying.");
    }
}

public class class_and_objects{
    public static void main(String[] args){
        Student s1= new Student();
        Student s2= new Student();

        s1.name="Rahul";
        s1.age=19;

        s2.name="Priya";
        s2.age=20;

        s1.study();
        s2.study();
    }
}*/



// 1st question : Create a class Car with attributes brand and price. Create an object and print its details.
/*
package oops;

class Car{
    String brand;
    int price;

    void display(){
        System.out.println("Brand = "+ brand + "Price = "+price);
    }
}

public class class_and_objects{
    public static void main(String[] args){
        Car c1=new Car();
        Car c2=new Car();
        Car c3=new Car();

        c1.brand="Toyota";
        c1.price=200000;

        c2.brand="Audi";
        c2.price=800000;

        c3.brand="BMW";
        c3.price=900000;

        c1.display();
        c2.display();
        c3.display();
    }
}*/


// 2nd Question : Create a class Student with name and age. Create 3 objects and print their data.


/*
class Student{
    String name;
    int age;

    void displayDetails(){
        System.out.println("Name of the student is : " + name + " and age is " + age);
    }
}


public class class_and_objects{


    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.name="Karan";
        s1.age= 19;

        s2.name="Neha";
        s2.age=18;

        s3.name="Prashant";
        s3.age=20;

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();

    }
}*/


// 3 : Create a Book class with attributes title, author, and price. Print them using a method.

class Book{
    String title;
    String author;
    int price;

    void displayDetails(){
        System.out.println("Title: "+ title);
        System.out.println("Author: "+ author);
        System.out.println("Price: "+ price);
    }
}

public class class_and_objects{
    public static void main(String[] args){
        Book b1= new Book();
        Book b2= new Book();
        Book b3= new Book();

        b1.title= "To Kill a Mockingbird";
        b1.author="Harper Lee";
        b1.price=290;

        b2.title="Animal Farm";
        b2.author="George Orwell";
        b2.price=203;

        b3.title="The Lord of the Rings";
        b3.author="J.R.R Tolkein";
        b3.price=400;

        b1.displayDetails();
        b2.displayDetails();
        b3.displayDetails();

    }
}