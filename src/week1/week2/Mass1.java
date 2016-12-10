package week1.week2;

/**
 * Created by User on 10.12.2016.
 */
public class Mass1 {
    public static void main(String[] args) {
        int[] a = new int[100];
        int start = 100;
        for(int i =0; i < a.length; i++ ){
           a[i]=a.length -1 -i;
            System.out.print( a[i] + " ");
        }


    }

}
