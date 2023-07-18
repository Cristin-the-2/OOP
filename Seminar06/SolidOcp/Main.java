package Projects_OOP.Seminar06.SolidOcp;

import Projects_OOP.Seminar06.SolidOcp.ocp.Canvas;
import Projects_OOP.Seminar06.SolidOcp.ocp.Circle;
import Projects_OOP.Seminar06.SolidOcp.ocp.RightTriangle;
import Projects_OOP.Seminar06.SolidOcp.ocp.Square;

public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.addShape(new RightTriangle(2, 3));
        canvas.addShape(new Square(4));
        canvas.addShape(new Circle(5));

        System.out.printf("Сумма площадей фигур равна %f \n", canvas.getArea());
    }
}
