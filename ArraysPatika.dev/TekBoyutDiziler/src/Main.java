public class Main {
    public static void main(String[] args) {
        int[] numbers = {35,65,95};
        System.out.print(numbers.length + "," + numbers[1]);

        int cars[], count=3;
        cars = new int[count];
        for(int i=0; i<cars.length; i++)
            cars[i] = (i+1)*2;
        for(int j=0; j<cars.length; j++)
            System.out.print(cars[j] + ",");

//        int[][] numberss;
//        numberss = new int[3][];
//        numbers[0] = {1,2};
//        System.out.println(numberss[0][1]);



    }
}