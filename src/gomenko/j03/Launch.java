package gomenko.j03;

/**
 * Created by Loner on 26.09.15.
 */
public class Launch {

    public static void main(String[] args) {
      int [][] xyz = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};

        for (int[] ints : xyz) {

            for (int i = 0; i < ints.length; i++) {
                if (i % 2 != 0) {
                    System.out.println(ints[i]);
                }
        }








        }

    }
}
