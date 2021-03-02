package inheritance;

public class Test_Shape {
    public static void main(String[] args) {
        Shape shape = new Shape();

        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);

        System.out.println("---------");

        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle("blue", false, 3.5);
        System.out.println(circle);

        System.out.println("-----------");
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle("orange", true, 2.5, 3.8);
        System.out.println(rectangle);

        System.out.println("--------");
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(shape);

        square = new Square("yellow", true, 5.8);
        System.out.println(square);
    }
}
