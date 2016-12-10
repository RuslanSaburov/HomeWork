package week1.week2.Day1.util;

/**
 * Created by User on 10.12.2016.
 */
public class ArrayUtils {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

    }


    public static int[] createAndFillArray(int size) {
        //create array
        int[] array = new int[size];
        // fill array
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        //return array
        return array;
    }


    public static int[] CreateAndFillRandomArray(int size) {
        //create array
        int[] array = new int[size];
        // fill array
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        //return array
        return array;
    }
}