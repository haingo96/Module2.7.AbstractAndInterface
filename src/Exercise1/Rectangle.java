package Exercise1;

public class Rectangle extends Shape implements Resizeable {
    double width, length;

    public Rectangle() {
        this.width = 1;
        this.length = 1;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }

    @Override
    public String toString() {
        return String.format("A Rectangle with width=%s and length=%s, which is a subclass of %s", this.width, this.length, super.toString());
    }

    @Override
    public void resize(double percent) {
        this.width += this.getWidth() * percent / 100;
        this.length += this.getLength() * percent / 100;
    }
}
