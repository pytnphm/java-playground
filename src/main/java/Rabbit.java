public class Rabbit extends Animal {
    private String eyeColor;

    public Rabbit(String name, String eyeColor) {
        this.name = name;
        this.eyeColor = eyeColor;
    }

    public void play(){
        System.out.println("RABBIT: " + name + " is being still." );
    }

    @Override
    public void play(Toy toy) {
        System.out.println("RABBIT: " + name + " is ignoring the toy " + toy );

    }
}
