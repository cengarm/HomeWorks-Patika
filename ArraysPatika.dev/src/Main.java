public class Main {
    static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
       int[] myList = new int[10]; // mylist adında boş bir 10 adet boyutunda list oluşturdum.
       for(int i=0 ; i < myList.length ; i++){
          myList[i] = (i * 10) + 10;
           System.out.println(myList[i]);

        }




    }
}