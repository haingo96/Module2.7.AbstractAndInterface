package Exercise1;

public class Circle extends Shape implements Resizeable{
    private double radius = 1.0d;

    Circle() {
    }

    Circle(double radius) {
        this.radius = radius;
    }

    Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return String.format("A Circle with radius = %s, which is a subclass of %s", this.getRadius(), super.toString());
    }

    @Override
    public void resize(double percent) {
        this.radius += this.getRadius() * percent / 100;
    }
}
