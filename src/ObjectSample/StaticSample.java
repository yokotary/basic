package ObjectSample;

//staticのまとめ
class StaticTest {
    //staticField
    static String staticField = "school";
    //staticMethod
    static  String staticMethod() {
        return "wars";
    }
    static int max(int x,int y){
        if (x>y) {
            return x;
        } else {
            return y;
        }
        //書きかけ

        //return Math.max(x,y);
    }
}
public class StaticSample {
    public static void main(String[] args) {
        //クラス名.フィールド名で利用できる
        System.out.println(StaticTest.staticField);
        //クラス名.メソッド名で利用できる
        System.out.println(StaticTest.staticMethod());
        System.out.println(StaticTest.max(10,20));
        //System.out.println(StaticTest.min(10,20));
    }
}
