package ex;

//配列を合計する
public class Ex3 {
    public static void main(String[] args) {
        int[] array = {20,30,10,50,40};//配列の宣言
        int sum = 0;//合計値の初期化
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
            System.out.println(sum);
    }
}
