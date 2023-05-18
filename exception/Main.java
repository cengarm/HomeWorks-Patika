package exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(); // girilen değerimiz int ama kullanıcıdan aldığımız değer stringse exception hatası alırız
        // İstisna durum !
        int b = 10;
        if ( a == 0 ){
            System.out.println( "Bir sayı sıfıra bölünemez");
        }else {
            System.out.println(b/a);
        }
    }
}