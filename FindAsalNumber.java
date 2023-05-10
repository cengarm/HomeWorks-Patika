import java.util.Scanner;

public class FindAsalNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("DİZİDE Kİ ASAL SAYI BULAN PROGRAMA HOŞGELDİNİZ");

        System.out.print("DİZİNİZ KAÇ ELEMANLI OLSUN ? : ");
        int numbers = scanner.nextInt();

        System.out.print("Lütfen Sayıları Giriniz :\n ");


        int[] findAsal = new int[numbers];
        for(int i=0 ; i < findAsal.length; i++){
            System.out.print("Dizinin "+ i + ". index değerini giriniz : " );
            findAsal[i] = scanner.nextInt();
        }
        System.out.println("Dizideki asal sayılar:");
        int count= 0;
        for (int i = 0; i < numbers; i++) {
            boolean isPrime = true;
            for (int j = 2; j < findAsal[i]; j++) {
                if (findAsal[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && findAsal[i] > 1) {
                System.out.print(findAsal[i] + " ");
                count++;
            }
        }

        // Dizide asal sayı yoksa
        if (count == 0) {
            System.out.println("Yok");
        }


    }
}
