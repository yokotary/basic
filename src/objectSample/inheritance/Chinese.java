package objectSample.inheritance;

class Chinese extends Human{
    public Chinese(String name) {
        super(name);
    }

    @Override
    public void hello() {
        System.out.println("你好，我叫" + name);
    }
}
