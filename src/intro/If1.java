package intro;


import java.time.LocalDateTime;
import java.util.Random;

//分岐命令 if その１
public class If1 {
    public static void main(String[] args) {
        //奇偶判定
        Random random = new Random(LocalDateTime.now().getSecond());
        int num = random.nextInt(100);
        if (num%2 == 0) {
            //偶数
            System.out.println(num + "は偶数です");
        } else {
            //奇数
            System.out.println(num + "は奇数です");
        }
    }
}
