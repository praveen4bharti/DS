package com.company;

import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        System.out.println("#####Alo Array Rotation#####");
        //shift one by one t\--one for loop and if
        //int arr[], int d
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;
        //int[] s = new int[0];
        //METHOD 1 Left rotate all elements of arr[] by one
//
//        for (int i = 0; i < d; i++) {
//            getArrayRotation(arr, d);
//
//        }
        //METHOD 1 (Using temp array)
     int[] arr2=rotateArraybyTempArray(arr, d);

        Arrays.stream(arr2).boxed().forEach(System.out::println);
        System.out.println("Finished!!!");
    }

    private static int[] rotateArraybyTempArray(int[] arr, int d) {
        int[] temp = new int[d];

        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        //temp and arr
        //  int i = d;
        int[] arr1 = new int[arr.length];
        int i = 0;
        for (int element = d; element < arr.length; element++) {
            arr1[i] = arr[element];
            i++;
        }
        int o = arr1.length - d;
        for (int ii : temp) {
            arr1[o] = ii;
            o++;
        }
        return arr1;
    }

    private static int[] getArrayRotation(int[] arr, int d) {
        // for(int i=0;i<d;i++){
        int temp = arr[0];
        for (int j = 0; j < arr.length - 1; j++) {
            //1-23456-7int temp=1
            arr[j] = arr[j + 1];
        }
        arr[arr.length - 1] = temp;

        return arr;
    }

}
