package Projects_OOP.Seminar06.SolidOcp.ocp;

import java.util.ArrayList;
import java.util.List;

public class Canvas {
    List<Shape> shapes;

    public Canvas() {
        shapes = new ArrayList<>();
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public double getArea() {
        double sumArea = 0;
        for (Shape shape : shapes) { 
            sumArea += shape.getArea();
        }
        return sumArea;
    }
}
