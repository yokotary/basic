package objectSample.arraySample;

import java.util.Arrays;

class ArraySample2 {
    public static void main(String[] args) {
        int[] array = {1,1,2,3,5,9,13};

        //インデックスを使って代入
        array[5] = 8;
        int value = array[6];
        System.out.println(Arrays.toString(array));
        System.out.println(value);
    }
}
