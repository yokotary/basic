package objectSample.abstractSample;

public class HumanSample {
    public static void main(String[] args) {
        American us1 = new American("Tom");
        Japanese jp1 = new Japanese("太郎");
        Chinese cn1 = new Chinese("俊杰");
        French fra = new French("Andrée");

        us1.hello();
        jp1.hello();
        cn1.hello();
        fra.hello();
    }
}
