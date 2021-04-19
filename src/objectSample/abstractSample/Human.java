package objectSample.abstractSample;

//抽象クラスのサンプル
//抽象メソッドがあったらクラスも抽象クラス
abstract class Human {
    //フィールド
    protected String name;
    //コンストラクタ
    public Human(String name) {
        this.name = name;
    }
    //抽象メソッド
    //処理が記述されていない、メソッド名までしか決定していない
    public abstract void hello();
}