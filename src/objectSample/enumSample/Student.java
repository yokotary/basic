package objectSample.enumSample;

public enum Student {
    AKAGUMI("紅組"),SHIROGUMI("白組"),MIDORIGUMI("緑組");

    private String jpClass;

    Student(String jpClass) {
        this.jpClass = jpClass;
    }

    public String getJpClass() {
        return jpClass;
    }
}