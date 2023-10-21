import java.util.Arrays;

public class ReverseArray {

    public static void reverse(int[] array) {

        int first = 0;
        int last = array.length-1;

        System.out.println("Array = " + Arrays.toString(array));

        while (last > first) {
            int temp = array[first];
            array[first] = array[last];
            array[last] = temp;
            first++;
            last--;
        }
        System.out.println("Reversed array = "  + Arrays.toString(array));
    }
}
