package objectSample.objectType;

//実行クラス
public class SampleMain {
    public static void main(String[] args) {
        //スーパークラスの型で変数定義、インスタンスを作成
        SampleSuper sampleSuper = new SampleSuper("abc");
        //スーパークラスで定義されたgetSuperFiled()が使用可能
        System.out.println(sampleSuper.getSuperFiled());
        //サブクラスの型で変数定義、インスタンスを作成
        SampleSub1 sampleSub1 = new SampleSub1("abc");
        //サブクラスで定義された３種類のメソッドが使用可能
        System.out.println(sampleSub1.getSuperFiled());
        sampleSub1.methodA();
        sampleSub1.methodB();

        //インターフェースMethodA型の変数を定義
        //サブクラスの型でインスタンスを作成
        IfMethodA sampleSub2 = new SampleSub1("abc");
        //インターフェースMethodAの型の変数なのでMethodAで定義されているメソッドのみ使用可能
        sampleSub2.methodA();
    }
}
