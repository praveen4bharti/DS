package com.company;


import java.util.Arrays;

public class ReversalAgloforArrRotation {
    public static void main(String[] args) {
//1.temp array merge
        //2.shift one by one and temp avariable
        //3.1234567---3456712
        //12--34567
        //reverse  21--76543
      //merge and reverse all //3456712
        int []arr={1, 2, 3, 4, 5, 6, 7};
        int d = 2;
        reverseAlgoArrayRotation(arr,d);

        Arrays.stream(arr).boxed().forEach(System.out::println);

    }

    private static void reverseAlgoArrayRotation(int[] arr, int d) {
        //arr1==12--reverse
        //arr2==34567--reverse
        //arr3=arr1+arr2//reverse
        rvereseArray(arr,0,d-1);
        rvereseArray(arr,d,arr.length-1);
        rvereseArray(arr,0,arr.length-1);

    }

    private static void rvereseArray(int[] arr, int i, int d) {
        while(i<d){
            int tmp = arr[i];
            arr[i]=arr[d];
            arr[d]=tmp;
            i++;
            d--;
        }
    }


}
