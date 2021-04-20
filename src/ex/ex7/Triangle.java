package ex.ex7;

public class Triangle extends Figure{
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
}
