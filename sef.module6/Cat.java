public class Cat implements Animal {

    @Override
    public void animalSound() {
        System.out.println("Saying: Meow Meow!");
    }

    @Override
    public void sleep() {
        System.out.println("sleeping like a cat...");
    }
}