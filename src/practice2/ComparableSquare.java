package practice2;

public class ComparableSquare extends Square implements Comparable<ComparableSquare>{
    public ComparableSquare(double side) {
        super(side);
    }

    public ComparableSquare() {
    }

    @Override
    public int compareTo(ComparableSquare square) {
        return Double.compare(this.getArea(), square.getArea());
    }

//    @Override
//    public int compareTo(ComparableSquare square) {
//        if (this.getArea() > square.getArea()) {
//            return 1;
//        } else if (this.getArea() == square.getArea()) {
//            return 0;
//        }else {
//            return -1;
//        }
//    }
}
