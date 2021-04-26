package objectSample.arraySample;

import java.util.Arrays;

public class ArraySample1 {
    public static int sum(int...array) {//可変長引数
        int sum = 0;
        for (int value:array){
            sum+= value;
        }
        return sum;
    }
    public static void main(String[] args) {
        //配列の宣言
        int[] array1 = new int[10];//サイズだけ指定
        int[] array2 = {1,2,3,4,5};//初期値も指定
        int[] array3 = new int[] {10,9,8,7,6};//new宣言と初期化

        System.out.println(Arrays.toString(array1));//文字列型として中身を表示する
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        System.out.println(array1);//これではハッシュコードが出てくる。
        System.out.println(array1.length);//配列の長さ
        //配列を引数に記述する場合
        System.out.println(ArraySample1.sum(array2));
        System.out.println(ArraySample1.sum(new int[]{10, 20, 30}));//配列を直で入力
        System.out.println(ArraySample1.sum(10, 20, 30, 40, 50));
    }
}
