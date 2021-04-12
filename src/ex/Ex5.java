package ex;

public class Ex5 {
    public static void main(String[] args) {
        int[] array = {20,30,10,50,40,200};//配列の宣言
        int max = array[0];//仮の最大値
        int min = array[0];//仮の最小値
        double sum = 0;
        double ave = 0.0;//平均を初期化
        //最大値
        for (int i = 0; i < array.length; i++) {
            if (max <= array[i]) {
                max = array[i];
            }
        }
        System.out.println("最大値: "+max);
        //最小値
        for (int i = 0; i < array.length; i++) {
            if (min >= array[i]) {
                min = array[i];
            }
        }
        System.out.println("最小値: "+min);
        //平均値
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            ave = sum / array.length;
        }
        System.out.println("平均値: "+ave);
    }
}
