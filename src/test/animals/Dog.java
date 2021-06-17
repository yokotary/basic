package test.animals;

class Dog extends Animal{
    @Override
    void cry() {
        System.out.println("wan!wan!");
    }

    public void ote() {
        System.out.println("右手を出す");
    }
}
