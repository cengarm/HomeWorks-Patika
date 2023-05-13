import java.util.ArrayList;
import  java.util.Arrays;
public class ArraysClassAndMethod {
    public static void main(String[] args) {
        int[] list ={1,21,35,43,5,99};
        System.out.println(Arrays.toString(list));
        Arrays.fill(list, 10);
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        Arrays.binarySearch(list,35);
        System.out.println(Arrays.binarySearch(list,1));


        //Arrays.copyOf() ve Arrays.copyOfRange(): arrayları copyalayıp yeni arr olusturmaya yarar.
        //Arrays.equals() : 2 listenin eşitliğini kontrol etmek için kullanılır.
        //Array.sort(list) küçükten büyüğe sıralar
        //Array.binarySearch istenilen arrayın sırasını bulur. Ama arrayın küçükten büyüğe (sort ) sıralı olmalı
        //Array.fill(list,10) : diziye ait filler yani döldürür  ( tüm listeyi 10 ile doldurdu).
        //Array.toString() : diziye ait elemanları direk ekrana basar.



    }
}
