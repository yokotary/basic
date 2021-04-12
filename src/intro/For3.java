package intro;

//拡張for命令
public class For3 {
    public static void main(String[] args) {
        int[] array = {20,30,10,50,40};//配列の宣言
        int sum = 0;//合計値の初期化
        for (int value:array) {
            System.out.println(value);
            sum += value;//配列の内容を合計に加算
        }
        System.out.println(sum);
    }
}
