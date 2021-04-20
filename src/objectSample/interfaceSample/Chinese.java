package objectSample.interfaceSample;

class Chinese extends Human implements IfHello{

    public Chinese(String name) {
        super(name);
    }

    @Override
    public void hello() {
        System.out.println("你好，我叫" + name);
    }
}
