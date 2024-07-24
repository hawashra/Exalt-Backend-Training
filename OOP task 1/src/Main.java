//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Catty", 2);
        Animal dog = new Dog("Maxi", 3);

        cat.move();
        dog.move();

        cat.makeSound();
        dog.makeSound();
    }
}