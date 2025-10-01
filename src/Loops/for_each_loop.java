package Loops;

/*
* The for-each loop is a special type of for loop introduced in Java 5 (Java SE 1.5) as part of the enhanced Collections Framework.
It is designed only for iterating over arrays and collections (like ArrayList, HashSet, etc.) without using indexes explicitly.*/

// Syntax
// for(datatype element : collection/array){ ..use element... }
/*
How it works internally

The loop starts from the first element of the array/collection.

Assigns the value to the element variable.

Executes the body of the loop.

Moves to the next element automatically.

Repeats until all elements are visited.
*/


public class for_each_loop {
    // examples with arrays
    public static void main(String[] args){
        int[] numbers = {10,20,30,40,50};

        for(int num : numbers){
            System.out.println(num);
        }
    }

}


/*  Example with Collections
import java.util.*;

public class ForEachCollectionExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Virat");
        names.add("Rohit");
        names.add("Dhoni");

        for (String player : names) {
            System.out.println(player);
        }
    }
}

*
* */


/*
🔹 Characteristics of for-each loop
✔ Cleaner & shorter code
✔ Avoids index mistakes
✔ Works for arrays and anything that implements Iterable (like ArrayList, HashSet, LinkedList, etc.)
✔ Read-only access → you get the element but can’t modify the collection structure directly

🔹 Limitations

❌ No index access – you can’t get the current index directly (use normal for if index needed).
❌ No backward iteration – moves only forward.
❌ No modification of collection – if you try to remove/add while iterating, you get ConcurrentModificationException.


🔹 Best Use Cases

Printing elements of an array/collection

Reading elements without caring about index

Cleaner iteration for read-only traversal
*/
