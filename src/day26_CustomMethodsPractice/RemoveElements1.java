package day26_CustomMethodsPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveElements1 {

    public static void main(String[] args) {
        int [] numbers = {100,200,300,400,500,600,700};
        numbers= removeElement(numbers,1);
        numbers= removeElement(numbers,1);

        System.out.println(Arrays.toString(numbers));

    }

    //                                  {1,2,3,4}     (remove) 4
    public static int [] removeElement (int [] array, int index) {
        if (index<0||index> array.length-1) {
            System.err.println("invalid index: "+ index);
            System.exit(0);
        }

        int [] result = new int[array.length-1];

        int j =0;
        for (int i= 0; i< array.length; i++) {
            if (i==index) {
                continue;
            }
            result[j++]=array[i];
        }

        return result;


    }




}
