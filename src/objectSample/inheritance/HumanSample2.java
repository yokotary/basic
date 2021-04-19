package objectSample.inheritance;

class HumanSample2 {
    public static void main(String[] args) {
        Human[] humans = {
                new Human("Tom"),
                new Japanese("太郎"),
                new Chinese("俊杰"),
                new French("Andrée")
        };

        for (Human human:humans) {
            human.hello();
        }
    }
}
