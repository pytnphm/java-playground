public class Cat extends Animal {

    // setter
    /*public void setName(String name) { //being able to change name
        this.name = name; //this = current object, want to use this.name = name over name = name
    }

    public String getName() {
        return name;
    } */

    // constructor
    public Cat(String name, int age) {
        super(name, age);
    }
    @Override
    public void play() {
        System.out.println("CAT: " + name + " jumps on the table");
    }

    @Override
    public void play(Toy toy) {
        System.out.println("CAT: " + name + " is playing the toy " + toy);
    }

}
