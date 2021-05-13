package objectSample.exceptionSample.original;

class Data {
    private String name;
    private Gender gender;
    private int age;

    public Data(String name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d",name,gender.getName(),age);
    }
}
