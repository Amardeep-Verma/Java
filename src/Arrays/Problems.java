package Arrays;

// 1: Find Maximum and Minimum in Array
//Input: [5, 3, 8, 1, 2]
//Output: Max = 8, Min = 1

public class Problems{
    public static void main(String[] args){
        int arr[] = {5,3,8,1,2};

        int max = arr[0];
        int min = arr[0];

        for(int i=1; i<arr.length;i++){
            if(arr[i]>max) max = arr[i];
            if(arr[i]<min) min = arr[i];

        }
        System.out.println("Max = " + max + ", Min = " + min);

    }
}