package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFinally{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("the program has started");
       int a = 1;
       int b = 20;
       int c;
       int[] arr = new int[2];
    try // try bloguna hatayı alması muhtemel yeri yazdık ! hata olduğunu deniyor.
    {
        System.out.println(b / a);
        c = scanner.nextInt();
        arr[10] = 11;
    }catch (Exception abc) // catch etmek yakalamak , hatayı yakalıyor ve catch kısmı boş olduğu için geçiyor
    {
        System.out.println("Aritmatik hata alındı");
        System.out.println(abc.getMessage());
    }finally { // hata alıcaksan ne olursa olsun bu kod çalışır
        System.out.println("Bu kısım kesin çalışacak");
    }
        System.out.println("the program is over");
    }
}

