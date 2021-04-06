package intro;

//分岐命令 if その２
public class If2 {
    public static void main(String[] args) {
        //if命令の入れ子（ネスト）
        //０以上かつ１００以下
        int num = 50;
        if (num >= 0) {
            if (num <= 100) {
                System.out.println(num + "は範囲内");
            } else {
                System.out.println(num + "は範囲外");
            }
        } else {
            System.out.println(num + "は範囲外");
        }

        //論理演算子を用いる
        if (num <= 0 && num >= 100) {
            System.out.println(num + "は範囲内");
        } else {
            System.out.println(num + "は範囲外");
        }


    }
}
