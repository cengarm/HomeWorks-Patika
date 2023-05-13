public class MaxMin {
    public static void main(String[] args) {
        int[] list = {55, 44,88,33,22,35,67};

        int max = list[0];
        int min = list[1];

        for(int i : list ){ // foreach
            if(i<min) {
                min = i;
            }
            if(i>max) {
                max = i;
            }
        }
        System.out.println("Minimum Değer : "+ min);
        System.out.println("Maximum Değer : "+ max);
    }
    }

