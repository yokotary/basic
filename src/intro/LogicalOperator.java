package intro;

public class LogicalOperator {
    public static void main(String[] args) {
        boolean t = true, f = false;

        //論理積(AND) &&
        System.out.println("論理積(AND)");
        System.out.println("f && f " + (f && f));
        System.out.println("t && f " + (t && f));
        System.out.println("f && t " + (f && t));
        System.out.println("t && t " + (t && t)); //true

        //論理和(OR) ||
        System.out.println("論理和(OR)");
        System.out.println("f || f " + (f || f));
        System.out.println("t || f " + (t || f)); //true
        System.out.println("f || t " + (f || t)); //true
        System.out.println("t || t " + (t || t)); //true

        //否定(NOT) !
        System.out.println("否定(NOT) !");
        System.out.println("!f " + (!f)); //true
        System.out.println("!t " + (!t));

        //演算結果は？
        System.out.println(f || !f && t);
        //否定>論理積>論理和の順

        //xが0以上かつ100以下
        System.out.println("xが0以上100以下");
        int x = 100;
        System.out.println(x >= 0 && x <= 100);

        //yが0未満または100超える数字
        System.out.println("yが0未満100超える数字");
        int y = -1;
        System.out.println(y < 0 || y > 100);
    }
}
