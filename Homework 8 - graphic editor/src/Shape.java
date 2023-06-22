abstract class Shape {
    public abstract String getShapeName();
}

class Circle extends Shape {
    @Override
    public String getShapeName() {
        return "Circle";
    }
}

class Quad extends Shape {
    @Override
    public String getShapeName() {
        return "Quad";
    }
}

class Triangle extends Shape {
    @Override
    public String getShapeName() {
        return "Triangle";
    }
}

class Rectangle extends Shape {
    @Override
    public String getShapeName() {
        return "Rectangle";
    }
}

class Ellipse extends Shape {
    @Override
    public String getShapeName() {
        return "Ellipse";
    }
}

class Pentagon extends Shape {
    @Override
    public String getShapeName() {
        return "Pentagon";
    }
}

class ShapePrinter {
    public void printShapeName(Shape shape) {
        System.out.println("Shape name: " + shape.getShapeName());
    }
}
