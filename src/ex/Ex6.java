package ex;

//該当するデータをカウントする
public class Ex6 {
    public static void main(String[] args) {
        int[] array = {89,102,300,50,0};
        int sum = 0;
        //100以上のデータの個数を数える
        for (int value:array) {
            if (value >= 100) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
