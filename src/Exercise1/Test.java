package Exercise1;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Shape[] shapeArr = new Shape[3];
        shapeArr[0] = new Circle();
        shapeArr[1] = new Rectangle();
        shapeArr[2] = new Square();

        Circle cir = (Circle) shapeArr[0];
        Rectangle rect = (Rectangle) shapeArr[1];
        Square sqr = (Square) shapeArr[2];

        System.out.println(Arrays.toString(shapeArr));

        cir.resize(50);
        rect.resize(60);
        sqr.resize(70);

        System.out.println(Arrays.toString(shapeArr));
    }
}
