package objectSample.interfaceSample;

class HumanSample{
    public static void main(String[] args) {
        IfHello[] humans = {
                new American("Tom"),
                new Japanese("太郎"),
                new Chinese("俊杰"),
                new French("Andrée")
        };

        for (IfHello human:humans) {
            human.hello();
        }
    }
}
