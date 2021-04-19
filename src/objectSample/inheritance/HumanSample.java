package objectSample.inheritance;

public class HumanSample {
    public static void main(String[] args) {
        Human human1 = new Human("Tom");
        Japanese jp1 = new Japanese("太郎");
        Chinese cn1 = new Chinese("俊杰");
        French french1 = new French("Andrée");

        human1.hello();
        jp1.hello();
        cn1.hello();
        french1.hello();
    }
}
