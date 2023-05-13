import java.util.Arrays;
import java.util.Scanner;

public class SmallestToLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin Boyutunu Giriniz :");
        int diziBoyut = scanner.nextInt();

        int[] arr = new int[diziBoyut] ;
        System.out.print("Dizinin elemanlarını giriniz : ");
        for (int i =0; i < diziBoyut ; i++){
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Küçükten Büyüğe Sıralanmış Hali : " +  Arrays.toString(arr));
    }
}
