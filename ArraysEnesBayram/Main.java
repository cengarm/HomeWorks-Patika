import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizi kaç elemanlı olsun : ");
        int arraysLenght = scanner.nextInt();

        String[] names = new String[arraysLenght];

        for (int i = 0; i < arraysLenght ; i++)
        {
            System.out.print("Dizinin "+ i + ". index değerini giriniz : " );
            names[i] = scanner.next();

        }
        System.out.println("*********DİZİNİN ELEMANLARI*********");
        for (int i = 0; i < arraysLenght ; i++){
            System.out.println(names[i]);
        }



    }
}
