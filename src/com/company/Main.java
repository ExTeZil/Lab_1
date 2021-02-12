package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Ведіть значення від 10-20 - ");
        int n = myObj.nextInt();
        switch (n){
            case (10):
                System.out.println("Десять");
                break;
            case (11):
                System.out.println("Одинадцять");
                break;
            case (12):
                System.out.println("Дванадцять");
                break;
            case (13):
                System.out.println("Тринадцять");
                break;
            case (14):
                System.out.println("Чотирнадцять");
                break;
            case (15):
                System.out.println("П'ятнадцять");
                break;
            case (16):
                System.out.println("Шістнадцять");
                break;
            case (17):
                System.out.println("Сімнадцять");
                break;
            case (18):
                System.out.println("Вісімнадцять");
                break;
            case (19):
                System.out.println("Дев'ятнадцять");
                break;
            case (20):
                System.out.println("Двадцять");
                break;
            default:System.out.println("Ви ввели невырне значення");
        }

    }
}
