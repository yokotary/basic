package objectSample.inheritance;

class Human {  //クラス
    //フィールド
    protected String name;
    //コンストラクタ
    public  Human(String name) {
        this.name = name;
    }
    //メソッド voidなのでリターンなし 実行して終了
    public void  hello() {
        System.out.println("Hello my name is " + name + ".");
    }
}
