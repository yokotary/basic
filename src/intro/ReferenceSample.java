package intro;

import java.util.Arrays;

public class ReferenceSample {
    public static void main(String[] args) {
        int[] array1 = {10,20,30};
        int[] array2 = array1;
        int[] array3 = Arrays.copyOf(array1,3);

        System.out.println("array1:" + Arrays.toString(array1));
        System.out.println("array2:" + Arrays.toString(array2));
        System.out.println("array3" + Arrays.toString(array3));

        array1[1] = 40;
        System.out.println("array1:" + Arrays.toString(array1));
        System.out.println("array2:" + Arrays.toString(array2));
        System.out.println("array3" + Arrays.toString(array3));
    }
}
