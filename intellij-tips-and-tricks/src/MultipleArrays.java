import java.util.Arrays;
import java.util.Objects;

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
                // System.out.print(array2[i][j] + " ");
                array2[i][j] = (i * 10) + (j + 1);
            }
            //System.out.println();
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
        // [[1, 2, 3, 4], [11, 12, 13, 14], [21, 22, 23, 24], [31, 32, 33, 34]]

        //todo_ Multi-dimensional Arrays
        array2[1] = new int[] {10, 20, 30};
        System.out.println(Arrays.deepToString(array2));
        // [[1, 2, 3, 4], [10, 20, 30], [21, 22, 23, 24], [31, 32, 33, 34]]

        Object[] anyArray = new Object[3];
        System.out.println(Arrays.toString(anyArray));
        // [null, null, null]

        anyArray[0] = new String[] {"a", "b", "c"};
        System.out.println(Arrays.deepToString(anyArray));
        // [[a, b, c], null, null]

        anyArray[1] = new String[][]{
                {"1", "2"},
                {"3", "4", "5"},
                {"6", "7", "8", "9"}
        };
        System.out.println(Arrays.deepToString(anyArray));
        // [[a, b, c], [[1, 2], [3, 4, 5], [6, 7, 8, 9]], null]

        anyArray[2] = new int[2][2][2];
        System.out.println(Arrays.deepToString(anyArray));
        // [[a, b, c], [[1, 2], [3, 4, 5], [6, 7, 8, 9]], [[[0, 0], [0, 0]], [[0, 0], [0, 0]]]]

        for (Object elem : anyArray) {
            System.out.println("Element type: " + elem.getClass().getSimpleName());
            System.out.println("Element to String: " + elem);
            System.out.println(Arrays.deepToString((Object[]) elem));
        }
//        Element type: String[]
//        Element to String: [Ljava.lang.String;@7699a589
//                [a, b, c]
//        Element type: String[][]
//        Element to String: [[Ljava.lang.String;@58372a00
//                [[1, 2], [3, 4, 5], [6, 7, 8, 9]]
//        Element type: int[][][]
//        Element to String: [[[I@378bf509
//                [[[0, 0], [0, 0]], [[0, 0], [0, 0]]]

    }
}
