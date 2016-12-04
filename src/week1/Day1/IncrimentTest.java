package week1.Day1;

/**
 * Created by User on 04.12.2016.
 */
public class IncrimentTest {
    public static void main(String[] args){
      int a = 6;
        System.out.println(a);

        int b = a++;
        System.out.println(b);
        System.out.println("A =" + a); // конкотенация строк, когда соедняем с "+"!
        System.out.println("B =" + b);

        int c = 10;
        System.out.println(c);
        System.out.println(++c);

        int d = ++c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);


    }
}
