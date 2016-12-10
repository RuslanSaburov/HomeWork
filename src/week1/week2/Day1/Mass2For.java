package week1.week2.Day1;

/**
 * Created by User on 10.12.2016.
 */
public class Mass2For {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for(int i=0; i<arr.length; i++){
            arr[i]=1;
        }
       for(int i=0; i<arr.length; i++){
            if(i==13){
               continue;
            }
            System.out.print(i + " ");
        }




    }
}
