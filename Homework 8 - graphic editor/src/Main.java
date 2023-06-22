public class Main {
    public static void main(String[] args) {
        ShapePrinter printer = new ShapePrinter();

        Circle circle = new Circle();
        printer.printShapeName(circle);

        Quad quad = new Quad();
        printer.printShapeName(quad);

        Triangle triangle = new Triangle();
        printer.printShapeName(triangle);

        Rectangle rectangle = new Rectangle();
        printer.printShapeName(rectangle);

        Ellipse ellipse = new Ellipse();
        printer.printShapeName(ellipse);

        Pentagon pentagon = new Pentagon();
        printer.printShapeName(pentagon);
    }
}
