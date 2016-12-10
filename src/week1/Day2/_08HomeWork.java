package week1.Day2;

import java.util.Scanner;

/**
 * Created by User on 07.12.2016.
 */
// Вычислить стоимость покупки с учетом скидки. Скидка в 10% предос-
//тавляется, если сумма покупки превышает 1000 гривен.

public class _08HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sale = sc.nextInt();

        if (sale == 1000 || sale < 1000){
            System.out.println("without sale");
        } boolean salepercent = sale > 1000;
        double discount = sale*0.1;
            System.out.println(discount);
           }
    }
