public class Main {
    public static void main(String[] args) {
        Cat coco = new Cat("coco", 14);
        Dog max = new Dog("max", 5, "peyton");
        Rabbit rabbit = new Rabbit("snow ball","red");
        Toy robot = new Toy("ABC Corp");
        Toy legoCar = new Toy("lego car");


        Action[] homeFriends = new Action[4];
        homeFriends[0] = coco;
        homeFriends[1] = max;
        homeFriends[2] = rabbit;
        homeFriends[3] = robot;

        Action[] animals = new Action[] {coco, max, rabbit, robot};
        for(Action friend : homeFriends) {
            friend.play(legoCar);
        }

    }
}
