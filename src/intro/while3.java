package intro;

import java.util.Scanner;

public class while3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("パスワードを入力してください");
        String str = in.nextLine();//キーボード入力

        while (!"abc".equals(str)) {
            System.out.println("パスワードが違います");
            str = in.nextLine();
        }
        System.out.println("OK");
    }
}
