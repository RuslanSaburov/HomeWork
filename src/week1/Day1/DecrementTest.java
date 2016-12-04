package week1.Day1;

/**
 * Created by User on 04.12.2016.
 */
public class DecrementTest {
    public static void main(String[] args){
       int a = 15;
        int b = a--; //POSTdecrement
        System.out.println("B = " + b);

        int c = 20; //PREdecrement
        int d = --c;
        System.out.println("D = " + d);
    }
}
