package ex.ex7;

public class FigureSample {
    public static void main(String[] args) {
        Figure[] figures = {
                new Circle(3.2),
                new Rectangle(3.5,2.5),
                new Triangle(2.2,4.5)
        };

        for (Figure figure:figures) {
            System.out.println(figure.getArea());
        }
    }
}
