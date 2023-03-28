package practice2;

public class Shape {
    String color;
    boolean filled;

    Shape() {
        this.color = "green";
        this.filled = true;
    }

    Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    String getColor() {
        return this.color;
    }

    void setColor(String color) {
        this.color = color;
    }

    boolean getFilled() {
        return this.filled;
    }

    void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return String.format("A Shape with color of %s and %s", this.color, this.filled? "filled" : "not filled");
    }
}
