package Excercise2;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle();
        shapes[1] = new Square();
        shapes[2] = new Circle();

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].getArea());
            if (shapes[i] instanceof Colorable) {
                ((Colorable) shapes[i]).howToColor();
            }
        }
    }
}
