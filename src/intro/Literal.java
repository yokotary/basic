package intro;

//リテラルの書き方
public class Literal {
    public static void main(String[] args) {
        //整数リテラル
        int num1 = 10; //１０進数
        int num2 = 012; //８進数 頭に0
        int num3 = 0xA; //１６進数 頭に0x
        int num4 = 0b1010; //２進数 頭に0b

        System.out.println("num1:" + num1);
        System.out.println("num2:" + num2);
        System.out.println("num3:" + num3);
        System.out.println("num4:" + num4);

        //型によるリテラル
        long num5 = 1L; //long型を明示
        float num6 = 3.14f; //float型を明示
        float num7 = 3f; //float型はf必須
        double num8 = 3d; //double型を明示

        System.out.println("num5:" + num5);
        System.out.println("num6:" + num6);
        System.out.println("num7:" + num7);
        System.out.println("num8:" + num8);

        //浮動小数点の指数表記
        double num9 = 0.123e+2; //0.123*10の2乗
        double num10 = 0.123e-2; //0.123*10の-2乗 小数点の０が多いときに省略して書く為に使う。使用頻度少ない

        System.out.println(num9); //12.3
        System.out.println(num10); //0.00123

        //文字型リテラル
        char c1 = 'A';
        char c2 = '\u0041'; //unicode
        char c3 = 65; //整数unicode

        System.out.println("c1:" + c1);
        System.out.println("c2:" + c2);
        System.out.println("c3:" + c3);

        //文字列型
        String str1 = "abc";
        String str2 = "あいうえお十百千";

        System.out.println("str1:" + str1);
        System.out.println("str2:" + str2);

    }
}
