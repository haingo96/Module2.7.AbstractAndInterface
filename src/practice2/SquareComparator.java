package practice2;

import java.util.Comparator;

public class SquareComparator extends Square implements Comparator<Square> {
    @Override
    public int compare(Square square1, Square square2) {
        return Double.compare(square1.getArea(), square2.getArea());
    }
}
