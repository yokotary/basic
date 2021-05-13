package objectSample.exceptionSample.original;

public enum Gender {
    MEN("男"),
    WOMEN("女");

    private final String name;

    private Gender(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
