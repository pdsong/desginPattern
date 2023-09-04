package protype.shapes;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 111;
        circle.y = 222;
        circle.radius = 15;
        shapes.add(circle);

        Circle anotherCircle=(Circle)circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 100;
        rectangle.height = 200;
        shapes.add(rectangle);
        shapes.add(rectangle.clone());
        cloneAndCompare(shapes, shapesCopy);


    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i+"   :shapes are different objects ");
                if(shapes.get(i).equals(shapesCopy.get(i)))
                    System.out.println(i+"  and they are identical");
                else
                    System.out.println(i+"  but they are diencial ");
            }
            else{
                System.out.println(i+"   Shape objects are the same");
            }
        }
    }


}
