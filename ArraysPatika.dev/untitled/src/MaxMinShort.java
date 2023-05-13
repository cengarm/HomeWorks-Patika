import java.util.Arrays;
import java.util.Scanner;



public class MaxMinShort {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz : ");
        int sayi = scanner.nextInt();
        int buyukEnYakin = sayi;
        int kucukEnYakin = sayi;
        Arrays.sort(list);
        System.out.println("Sıralı :" + Arrays.toString(list));

        for(int i : list){
            if(i<sayi){
                kucukEnYakin = i;
            }
            if(i>sayi){
                buyukEnYakin = i;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın say : " + kucukEnYakin);
        System.out.println("Girilen sayıdan büyük en yakın say : " + buyukEnYakin);
    }

}
