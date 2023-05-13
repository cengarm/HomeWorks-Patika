public class TersArray {

    static int[] reverseArray(int[] list) {
        int[] reverseArray = new int[list.length];
        for (int i = 0, j = list.length - 1; i < list.length; i++, j--) {
            reverseArray[i] = list[j];
        }
        return reverseArray;
    }
    static void printArray(int[] list){
        for(int i = 0; i <list.length; i++) {
        System.out.println(list[i]);
    }

    }

    public static void main(String[] args) {
        int[] list = {10,20,30,40,50};
        int[] newList = reverseArray(list);
        printArray(newList);

    }
}
