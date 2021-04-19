package objectSample.inheritance;

class Japanese extends Human{
    public Japanese(String name) {
        super(name); //スーパークラスのコンストラクタ
    }

    @Override
    public void hello() {
        System.out.println("こんにちは、私の名前は" + name + "です。");
    }
}
