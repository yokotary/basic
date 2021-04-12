package intro;

//for命令のサンプル１
public class For1 {
    public static void main(String[] args) {
        int sum = 0;//合計の初期化
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println(i + "回目: " + sum);
        }
        System.out.println(sum);
    }
}
