package week1.Day2;

import java.util.Scanner;

/**
 * Created by User on 07.12.2016.
 */
//7) Ввести с экрана число от 1 до 12. По номеру месяца выдать сообщение о
//времени года. Если пользователь введет недопустимое число, программа
       // должна выдать сообщение об ошибке.
public class _07HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the month");
        int month = sc.nextInt();

        if ( month == 12 || month == 1 || month == 2){
            System.out.println("winter");
        }else if(month == 3 || month == 4 || month == 5){
            System.out.println("spring");
        }else if(month == 6 || month == 7 || month == 8){
            System.out.println("summer");
        }else if(month == 9 || month == 10 || month == 11){
        }else{
            System.out.println("wrong");
        }


    }

}
