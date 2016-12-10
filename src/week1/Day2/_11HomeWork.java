package week1.Day2;

import java.util.Scanner;

/**
 * Created by User on 09.12.2016.
 */
//Написать программу, которая при вводе числа в диапазоне от 1 до 99
//добавляет к нему слово "копейка" в правильной форме. Например, 1 копейка, 5 копеек, 42 копейки .

public class _11HomeWork {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int coin = scanner.nextInt();

        if(coin == 1 && coin >= 1 || coin == 99){
          System.out.print(coin + " coin");
        }else {
            System.out.println("enter from 1, to 99");
        }
    }
}
