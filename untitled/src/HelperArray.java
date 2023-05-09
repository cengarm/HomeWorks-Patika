public class HelperArray {
    static void print(int[] arr){
        for(int i=0; i < arr.length; i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
    static int search(int[] arr, int value){
        for(int i = 0; i< arr.length; i++){
            if(arr[i] == value ){
                return i;
            }
        }
        return -1;
    }
}

