package day26_CustomMethodsPractice;

public class FrequencyOfElement {

    public static void main(String[] args) {
        int[] number = {1, 4, 1, 1, 1, 2, 3, 4, 4, 5, 5, 6, 7, 8, 9};

        int frequency = frequencyOfElement(number,4);

        System.out.println(frequency);
    }


    //return the frequency of the given element in the given array
    //                                      [1,1,1,1,2,3,4,5]   1
    public static int frequencyOfElement (int [] array, int element) {

        int count = 0;
        for (int each : array) {
            if (each==element) {
                count++;
            }
        }
        return count;
    }
    public static int frequencyOfElement (char [] array, char element) {

        int count = 0;
        for (char each : array) {
            if (each==element) {
                count++;
            }
        }
        return count;
    }
    public static int frequencyOfElement (double [] array, double element) {

        int count = 0;
        for (double each : array) {
            if (each==element) {
                count++;
            }
        }
        return count;
    }
    public static int frequencyOfElement (String [] array, String element) {

        int count = 0;
        for (String each : array) {
            if (each.equals(element)) {
                count++;
            }
        }
        return count;
    }



}
