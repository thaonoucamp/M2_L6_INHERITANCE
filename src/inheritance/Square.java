package inheritance;

public class Square extends Rectangle{
    public Square(double side) {
        super(side, side);
    }

    public Square() {
    }

    public Square(String color, boolean filled, double side ) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        this.setSide(side);
        this.setHeight(side);
    }

    @Override
    public String toString() {
        return "Square{" + super.toString() +
                "side=" + getHeight() +
                '}';
    }
}
