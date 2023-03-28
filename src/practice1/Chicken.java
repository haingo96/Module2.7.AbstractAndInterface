package practice1;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "oe oe";
    }

    @Override
    public String howToEat() {
        return "cook";
    }
}
