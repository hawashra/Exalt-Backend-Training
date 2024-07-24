public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("cat eats");
    }

    @Override
    public void sleep() {
        System.out.println("cat sleeps");

    }

    @Override
    public void move() {
        System.out.println("cat moves");

    }

    @Override
    public void makeSound() {
        System.out.println("Meow meow");
    }

    @Override
    public void play() {
        System.out.println("Cat plays");
    }

    @Override
    public String toString() {
        return "Cat name: " + getName() + " age: " + getAge();
    }
}
