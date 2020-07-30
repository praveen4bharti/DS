package com.company;

import java.util.Arrays;

public class ArrayArrangementRearrangement {
    public static void main(String[] args) {
        System.out.println("#####Arrangement Rearrangement########");
        //arr  0---N re-arrange
        //sort an array--loop and arr[i]!=i then -1 else arr[i]
        //2 4 3 1 5
        //2---- 2 a[j] <a[i] then a[j]=a[i]
//-1.-loop and if condition
        //-2 HashSet
        //-3 swap tot emp array
        int []arr={-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        int []arr1=arrayArrangement(arr);
//        for (int i = 0; i < arr.length;) {
//            if (arr[i] >= 0 && arr[i] != i) {
//                int ele = arr[arr[i]];
//                arr[arr[i]] = arr[i];
//                arr[i] = ele;
//            } else {
//                i++;
//            }
//        }
        Arrays.stream(arr1).boxed().forEach(System.out::println);
    }

    private static int[] arrayArrangement(int[] arr) {
        int o=0;
        int[] arr1 = new int[arr.length];

        for(int i :arr){
            if(i>=0 && i!=o){
                int x=arr[arr[o]];
              arr[arr[o]]  =arr[o];
              arr[o]=x;
            }
            o++;
        }
        return arr;
    }

}
