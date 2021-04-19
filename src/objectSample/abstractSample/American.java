package objectSample.abstractSample;

class American extends Human{
    public American(String name) {
        super(name);
    }

    @Override
    public void hello() {
        System.out.println("Hello my name is " + name + ".");
    }
}
