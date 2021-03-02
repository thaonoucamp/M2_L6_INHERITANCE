package inheritance;

public class Circle extends Shape{
    // lop hinh tron ke thua tu lop shape;
    // bo sung thuoc tinh ban kinh;
    private double radius = 1.0d;

    public Circle() {
    }

    public Circle(String color, boolean filled) {
        super(color, filled);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" + super.toString() +
        "radius=" + radius +
                '}';
    }

    // bo sung phuong thuc tinh dien tich va chu vi;
    public double getArea(double radius) {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter() {
        return this.radius * 2 * Math.PI;
    }
}
