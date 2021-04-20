package objectSample.interfaceSample;

class American extends Human implements IfHello{

    public American(String name) {
        super(name);
    }

    @Override
    public void hello() {
        System.out.println("Hello my name is " + name + ".");
    }
}
