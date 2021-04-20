package ex.ex8;

public class IfGetAreaSample {
    public static void main(String[] args) {
        IfGetArea[] figures = {
          new Circle(3),
          new Triangle(5,2),
          new Rectangle(3,4)
        };

        for (IfGetArea figure:figures) {
            System.out.println(figure);
        }
    }
}
