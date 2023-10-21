import java.util.Arrays;

public class MultipleArrays  {

    public static void main(String[] args) {

        //todo_ two-dimensional array
        int[][] array2 = new int[4][4];
        System.out.println(Arrays.toString(array2));
        System.out.println("array2.length = " + array2.length);
        //* array2.length = 4

        for (int[] outer: array2) {
            // System.out.println(outer);
            System.out.println(Arrays.toString(outer));
//            [0, 0, 0, 0]
//            [0, 0, 0, 0]
//            [0, 0, 0, 0]
//            [0, 0, 0, 0]
        }

        for (int i = 0; i < array2.length; i++) {
            var innerArray = array2[i];
            for (int j = 0; j < innerArray.length; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (var outer : array2) {
            for (var elem : outer) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
//        0 0 0 0
//        0 0 0 0
//        0 0 0 0
//        0 0 0 0

        System.out.println();

        System.out.println(Arrays.deepToString(array2));
        // [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]

    }
}
