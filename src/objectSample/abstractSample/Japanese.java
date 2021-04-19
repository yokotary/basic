package objectSample.abstractSample;


class Japanese extends Human {
    //スーパークラスのコンストラクタ
    public Japanese(String name) {
        super(name);
    }

    @Override
    public void hello() {
        System.out.println("こんにちは、私の名前は" + name + "です。");
    }
}
