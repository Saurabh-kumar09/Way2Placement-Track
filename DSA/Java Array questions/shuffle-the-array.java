//Write a Java program to Shuffle the Array

import java.util.Arrays;

public class shuffleArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,5};
        int n = (arr.length)/2;
        int[] newArray = new int[2*n];
        int k=0;
        for (int i=0; i<2*n; i=i+2){
            newArray[i] = arr[k];
            newArray[i+1] = arr[n+k];
            k++;
        }
        System.out.println(Arrays.toString(newArray));
    }
}
