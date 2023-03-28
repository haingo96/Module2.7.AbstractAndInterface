package practice2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ComparableSquare square1 = new ComparableSquare();
        ComparableSquare square2 = new ComparableSquare(3);

        System.out.println(square1.compareTo(square2));

        SquareComparator squareComparator = new SquareComparator();

        Square[] square = new Square[3];
        square[0] = new Square(1);
        square[1] = new Square(3);
        square[2] = new Square(2);

        for (int i = 1; i < square.length; i++) {
            Square temp = new Square();
            if (squareComparator.compare(square[i], square[i - 1]) == -1) {
                temp = square[i];
                square[i] = square[i - 1];
                square[i - 1] = temp;
            }
        }

        System.out.println(Arrays.toString(square));
    }
}
