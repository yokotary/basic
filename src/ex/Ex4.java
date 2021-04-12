package ex;

//九九の表示
public class Ex4 {
    public static void main(String[] args) {
            for (int i = 1; i < 10; i++) {
                for (int j = 1; j < 10; j++) {
                System.out.print(i + "*" + j + "=" + (i * j) + " ");
                }//先にここ繰り返す
                System.out.println();//改行　jが10まで行ったらここ
        }
    }
}
