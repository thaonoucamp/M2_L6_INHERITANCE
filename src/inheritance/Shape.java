package inheritance;

public class Shape {
    // lop Shape co 2 thuoc tinh mau sac va ve;
    private String color = "green";
    private boolean filled = true;

    // co ham khoi tao;
    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // co phuong thuc get/set de thay doi gia tri thuoc tinh;
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // co ghi de phuong thuc toString;
    @Override
    public String toString() {
        return "color='" + color + '\'' +
                ", filled=" + filled;
    }
}
