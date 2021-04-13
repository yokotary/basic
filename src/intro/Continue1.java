package intro;

public class Continue1 {
    public static void main(String[] args) {
        int[] array = {1,2,-3,4,5};
        //負の数値を発見したらスキップ
        for (int value:array) {
            if (value<0) {
                System.out.println("スキップ");
                continue;//負の数ならスキップ
            }
            System.out.println(value);
        }
    }
}
