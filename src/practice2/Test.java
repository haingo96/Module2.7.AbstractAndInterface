package practice2;

public class Test {
    public static void main(String[] args) {
        ComparableSquare square1 = new ComparableSquare();
        ComparableSquare square2 = new ComparableSquare(3);

        System.out.println(square1.compareTo(square2));
    }
}
