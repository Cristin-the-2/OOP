package Projects_OOP.Seminar06.SolidLsp;

import Projects_OOP.Seminar06.SolidLsp.lsp.Rectangle;

public class ViewShape {
    private Rectangle rectangle;

    public ViewShape(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public void showArea() {
        System.out.print("Площадь прямоугольника равна:");
        System.out.println(rectangle.getArea());
    }
}
