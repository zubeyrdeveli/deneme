package day22_MultiDimensionArray;

import java.util.Arrays;

public class MultiDimensionalArray2 {
    public static void main(String[] args) {

        int [] arr1 = {1,2,3};
        int [] arr2 = {4,5,6};
        int [] arr3 = {7,8,9};

        int [][] arr2D = { {1,2,3},{4,5,6},{7,8,9} };

        System.out.println("----------------------------------------");
        // index                   0       1       2               0          1         2
        int [][][] arr3D = {  { {1,2,3},{4,5,6},{7,8,9} } , { {10,20,30},{40,50,60},{70,80,90} }   };
        // index numbers                    0                                   1

        //[index num of 2DArray][index num of 1DArray][index num of elements]

        System.out.println(Arrays.deepToString(arr3D));
        System.out.println("-----------------------------");

        System.out.println(Arrays.deepToString(arr3D[1]));

        System.out.println("----------------------------");

        System.out.println(Arrays.toString(arr3D[1][1]));

        System.out.println("--------------------------");

        System.out.println(arr3D[0][2][2]);

        System.out.println("---------------------------------");

        for (int[][] each2D : arr3D) {
            for (int[] each1D : each2D) {
                for (int eachElement : each1D) {

                    System.out.print(eachElement + " ");
                }
            }
        }


    }
}
