package basics;
//TYPE CONVERSION AND CASTING  = type casting means converting one data type into another. Ex - turning an int into a double
// in java - there are two types of casting = 1: Widening Casting (automatic) converting a smaller type to a larger type size = byte -> short -> char -> int ->long -> float -> double
// 2: Narrowing Casting (manual) - converting a larger type to a smaller type size = double -> float -> long -> int -> char -> short -> byte

import java.net.StandardSocketOptions;

public class typeConversion {
     public static void main(String[] args){
      /*
         Widening Casting
         int myInt = 9;
         double myDouble = myInt; // Automatic casting : int to double
         System.out.println(myInt);
         System.out.print(myDouble);*/



         //Narrowing Casting

         int myInt = 9;
         double myDouble = myInt;
         System.out.println(myInt);  // 9
         System.out.println(myDouble); // 9.0
     }
}
