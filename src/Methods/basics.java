// ReturnType nameOfTheMethod(Type argumentName){ body }
package Methods;

// 1: Create a method printHello() that prints "Hello, World!" when called.

/*
class Hello{
    void helloWorld(){
        System.out.println("Hello World");
    }
}
public class basics{
    public static void main(String[] args){
        Hello obj = new Hello();
        obj.helloWorld();
    }
}*/


// 2: Create a method addNumbers(int a, int b) that takes two numbers as parameters and prints their sum.
/*class add{
    int addNumbers(int a,int b){
        return a+b;
    }
}

public class basics{
    public static void main(String[] args){
        add obj= new add();
        int result = obj.addNumbers(2,3);
        System.out.println("The Sum of the entered number is "+result);
    }
}*/


// Alternative of above code

/*class Calculator {
    static int addNumbers(int a, int b) {
        return a + b;
    }
}

     public class basics {
    public static void main(String[] args) {
        // No need to create object here
        int result = Calculator.addNumbers(2, 3);
        System.out.println("The sum of the entered numbers is " + result);
    }
}

Why static?

A static method belongs to the class itself, not an object.

This means you can call it without creating an object.*/


// 3: Create a method square(int n) that takes a number and returns its square.

