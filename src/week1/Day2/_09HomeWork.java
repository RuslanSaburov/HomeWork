package week1.Day2;

import java.util.Scanner;

/**
 * Created by User on 08.12.2016.
 */
//Написать программу вычисления идеального веса пользователя (рост-100). Выдать рекомендации о необходимости поправиться либо похудеть.
public class _09HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        int weighta = sc.nextInt();
        if( weight <85){
            System.out.println("eat more");//почему мне приходиться 2 раза вводить в консоль значение?
        }else if(weighta > 105){
            System.out.println("eat less");
        }

    }
}