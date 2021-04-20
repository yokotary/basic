package ex.ex8;

public class Triangle implements IfGetArea{
    private double base;
    private double height;

    public Triangle(double height, double base) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return base * height /2;
    }

    @Override
    public String toString() {
        return String.format("面積は%.2f",getArea());
    }
}
