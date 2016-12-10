package week1.week2;

/**
 * Created by User on 10.12.2016.
 */
public class MassWhile {
    public static void main(String[] args) {
        int[] numb = {1, 3, 5, 7, 9, 11, 13, 15, 17};
        System.out.println(numb);


        int[] numba = new int[9];
        int start = 0;
        while (start < 9){
            numba[start] = start;
            start++;
            System.out.println(start);
        }
    }
}
