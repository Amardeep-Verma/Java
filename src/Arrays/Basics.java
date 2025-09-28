package Arrays;


/*
  In Java, an array is an important linear data structure that allows us to store multiple values of the same type.
  Arrays in Java are objects, like all other objects in Java, arrays implicitly inherit from the java.lang.Object class. This allows you to invoke methods defined in Object (such as toString(), equals() and hashCode()).
  Arrays have a built-in length property, which provides the number of elements in the array.

  public class Geeks {
    public static void main(String[] args) {

        // initializing array
        int[] arr = { 40,55,63,17,22,68,89,97,89};

        // size of array
        int n = arr.length;

        // traversing array
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}



Key features of Arrays
Store Primitives and Objects: Java arrays can hold both primitive types (like int, char, boolean, etc.) and objects (like String, Integer, etc.)
Contiguous Memory Allocation When we use arrays of primitive types, the elements are stored in contiguous locations. For non primitive types, references of items are stored at contiguous locations.
Zero-based Indexing: The first element of the array is at index 0.
Fixed Length: After creating an array, its size is fixed; we can not change it.


BASIC OPERATION ON ARRAYS

1. DECLARING AN ARRAY
Method 1 : int arr[];
Method 2 : int[] arr;


2. INITIALIZATION AN ARRAY
When an array is declared , only a reference of an array is created . We use "new" to allocate an array of given size.
Ex: int arr[] = new int[size];
Array Declaration is generally static, but if the size in not defined, the Array is Dynamically sized.
Memory for arrays is always dynamically allocated (on heap segment) in Java. This is different from C/C++ where memory can either be statically allocated or dynamically allocated.
The elements in the array allocated by new will automatically be initialized to zero (for numeric types), false (for boolean) or null (for reference types).


ARRAY LITERAL IN JAVA
In a situation where the size of the array and variables of the array are already known, array literals can be used.

// Declaring array literal
int[] arr = new int[]{ 1,2,3,4,5,6,7,8,9,10 };

The length of this array determines the length of the created array.
There is no need to write the new int[] part in the latest versions of Java.


3. CHANGE AN ARRAY ELEMENT
To change an element , assign a new value to a specific index. The index begins with 0 and ends at (total array size ) - 1.

// Changing the first element to 90.
arr[0] = 90;

4. ARRAY LENGTH
int n = arr.length;


5. ACCESSING AND UPDATING ALL ARRAY ELEMENTS
class Geeks {
    public static void main(String[] args)
    {
        // declares an Array of integers.
        int[] arr;

        // allocating memory for 5 integers.
        arr = new int[5];

        // initialize the elements of the array, first to last(fifth) element
      	arr[0] = 2;
		arr[1] = 4;
        arr[2] = 8;
        arr[3] = 12;
        arr[4] = 16;

        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at index " + i + " : " + arr[i]);
    }
}



// ARRAY OF OBJECTS IN JAVA
An array of objects is created like an array of primitive-type data items
class Student {
    public int roll_no;
    public String name;

    Student(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
    }
}

public class Geeks {
    public static void main(String[] args){

        // declares an Array of Student
        Student[] arr;

        // allocating memory for 5 objects of type Student.
        arr = new Student[5];

        // initialize the elements of the array
        arr[0] = new Student(1, "aman");
        arr[1] = new Student(2, "vaibhav");
        arr[2] = new Student(3, "shikar");
        arr[3] = new Student(4, "dharmesh");
        arr[4] = new Student(5, "mohit");

        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at " + i + " : { "
                               + arr[i].roll_no + " "
                               + arr[i].name+" }");
    }
}

// WHAT HAPPENS IF WE TRY TO ACCESS ELEMENTS OUTISDE THE ARRAY SIZE
JVM throws ArrayIndexOutOfBoundsException to indicate that the array has been accessed with an illegal index.


// PASSING ARRAYS TO METHODS
Like variables, we can also pass arrays to methods. For example, the below program passes the array to method sum to calculate the sum of the array's values.
public class Geeks {
    // Driver method
    public static void main(String args[])
    {
        int arr[] = { 3, 1, 2, 5, 4 };

        // passing array to method m1
        sum(arr);
    }

    public static void sum(int[] arr)
    {
        // getting sum of array values
        int sum = 0;

        for (int i = 0; i < arr.length; i++)
            sum += arr[i];

        System.out.println("sum of array values : " + sum);
    }
}
This Java program demonstrates how to pass an array to a method.
An integer array arr is declared and initialized in the main method.
The sum() method is called with arr as an argument.
Inside the sum() method, all array elements are added using a for loop.
The final sum is then printed to the console.



// RETURNING ARRAYS FROM METHODS
As usual, a method can also return an array. For example, the below program returns an array from method m1.

class Geeks {
    // Driver method
    public static void main(String args[])
    {
        int arr[] = m1();

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static int[] m1()
    {
        // returning  array
        return new int[] { 1, 2, 3 };
    }
}
*/








/*public class Basics {
    public static void main(String[] args){
        int nums[]={4,5,6,7};
        nums[2]=10;
        System.out.println(nums[2]);


        // Declare array dynamically
        int arr[] = new int[5];
        System.out.println(arr[2]);
        arr[2]=5;

        System.out.println(arr[2]);
        
    }
}*/

