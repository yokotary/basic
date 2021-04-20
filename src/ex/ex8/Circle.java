package ex.ex8;

public class Circle implements IfGetArea{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius*radius*3.14;
    }

    @Override
    public String toString() {
        return String.format("面積は%.2f",getArea());
    }

}
