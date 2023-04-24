public class Dog extends Animal {
    private String owner;

    public Dog(String name, int age, String owner) {
        super(name, age);
        this.owner = owner;
    }

    public void play() {
        System.out.println("DOG: " + name + " is chasing his tail");
    }

    @Override
    public void play(Toy toy) {
        System.out.println("DOG: " + name + " is trying to eat the toy " + toy);

    }
}
