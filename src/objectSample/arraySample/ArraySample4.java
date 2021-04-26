package objectSample.arraySample;

import java.util.Arrays;

class ArraySample4 {
    public static void main(String[] args) {
        int[] array = {50,20,40,30,10};
        System.out.println("整列前"+Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("整列後"+Arrays.toString(array));
    }
}
