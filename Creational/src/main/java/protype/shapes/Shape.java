package protype.shapes;

import java.util.Objects;

public abstract class Shape {
    public int x;
    public int y;
    public String color;

    public Shape() {
    }

    public abstract Shape clone();

    public Shape(Shape targe) {
        if (targe != null) {
            this.x = targe.x;
            this.y = targe.y;
            this.color = targe.color;
        }
    }

    @Override
    public boolean equals(Object obj2) {
        if (!(obj2 instanceof Shape))
            return false;
        Shape shape2 = (Shape) obj2;
        return shape2.x == x && shape2.y == y && Objects.equals(shape2.color, color);
    }
}
