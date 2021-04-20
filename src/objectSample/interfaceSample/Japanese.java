package objectSample.interfaceSample;

//日本人クラスインターフェース版
//フィールドnameだけHumanから引き継いだ書き方
class Japanese extends Human implements IfHello{

    public Japanese(String name) {
        super(name);
    }

    @Override
    public void hello() {
        System.out.println("こんにちは、私の名前は" + name + "です。");
    }
}
