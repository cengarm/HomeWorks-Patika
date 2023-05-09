public class Foreach {
    public static void main(String[] args) {
        // normal list :
        int[] list = {1,2,3,4,5};

        for(int i =0; i < list.length;i++){ // normal for döndüsü
           // System.out.println(list[i]);

        }
        int sum =0 ;
        for (int i : list) { // foreach ile birlikte
            sum += i ;

        }
        System.out.println(sum);



        int[] scores = new int[10];
        scores = new int[3];
        scores = new int[]{215, 234, 218, 189, 221, 290};

        for (int score : scores) {
            System.out.print(score + "  ");
        }
    }
    }
