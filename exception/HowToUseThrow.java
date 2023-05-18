package exception;

import java.util.Scanner;

public class HowToUseThrow {

    public static void checkAge(int age) throws Exception {
    if (age < 18){
       throw new AgeCheckException("YAŞINIZ GİRİŞ İÇİN UFAK");
    } else {
        System.out.println("Yaşınız uygundur!");
    }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yaşınızı giriniz ! :  ");
        int age = scanner.nextInt();
        checkAge(age);
    }
}
