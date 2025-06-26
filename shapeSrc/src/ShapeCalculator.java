import java.util.ArrayList;
import java.util.List;

public class ShapeCalculator {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4,5);
        Shape triangle = new Triangle(3,4,5);
        Shape square = new Rectangle(4,4);
        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(circle);
        shapeList.add(rectangle);
        shapeList.add(triangle);
        shapeList.add(square);
        String shapeType ="";
        for (Shape shape : shapeList) {

            double area = shape.calculateArea();
            double perimeter = shape.calculatePerimeter();
            switch (shape) {
                case Circle circle1 -> shapeType = "Circle";
                case Rectangle rectangle1 -> shapeType = "Rectangle";
                case Triangle triangle1 -> shapeType = "Triangle";
                default -> {
                }
            }
            if(shape instanceof  Rectangle){
                if(((Rectangle) shape).getLength() == ((Rectangle) shape).getBreadth()){
                    shapeType="Square";
                }

            }
            System.out.println("Area of "+shapeType+" is "+ area +" sq.units.");
            System.out.println("Perimeter of "+shapeType+" is "+ perimeter +" units.");
        }

    }
}
