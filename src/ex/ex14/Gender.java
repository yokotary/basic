package ex.ex14;

public enum Gender {
    MEN("男"),
    WOMEN("女");

    private String name;

    private Gender(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
