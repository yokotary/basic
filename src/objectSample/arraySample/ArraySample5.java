package objectSample.arraySample;

import java.util.Arrays;

class ArraySample5 {
    public static void main(String[] args) {
        int[] array = {50,20,40,30,10};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.binarySearch(array, 10));
        System.out.println(Arrays.binarySearch(array, 60));
    }
}
