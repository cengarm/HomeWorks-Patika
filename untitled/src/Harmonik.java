import java.util.Scanner;

public class Harmonik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin Boyutunu Giriniz : ");
        int diziBoyut = scanner.nextInt();

        double[] arr = new double[diziBoyut];
        System.out.print("Dizinin Elamanlarını Giriniz : ");
        for(int i = 0; i < diziBoyut; i++){
            arr[i] = scanner.nextDouble();
        }

        double sum = 0.0;
        for(int i = 0; i < diziBoyut; i++){
            sum += 1.0 /arr[i];
        }
        double harmonic = diziBoyut/sum;
        System.out.println("Dizinin Harmonik Ortalaması  : " + harmonic);
    }


}
