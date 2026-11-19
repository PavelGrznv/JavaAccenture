public class Dog implements Animal {

    @Override
    public void animalSound() {
        System.out.println("Saying: Wuf Wuf!");
    }

    @Override
    public void sleep() {
        System.out.println("sleeping like a dog...");
    }
}