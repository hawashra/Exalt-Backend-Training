public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Dog eats");
    }

    @Override
    public void sleep() {

        System.out.println("Dog sleeps");
    }

    @Override
    public void move() {
        System.out.println("Dog moves");
    }

    @Override
    public void makeSound() {

        System.out.println("Woof woof");
    }

    @Override
    public void play() {
        System.out.println("Dog plays");
    }

    @Override
    public String toString() {
        return "Dog name: " + getName() + ", age: " + getAge();
    }
}
