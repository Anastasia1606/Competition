package org.example;

public class Human extends Alive{

    final int maxRunDistanse = 1000;
    final int maxJumpHeight = 3;
    public Human(String name) {
        super(name);
    }

    public Human() {
        super();
    }

    @Override
    boolean run(Treadmill distance) {

        if (distance.length <= maxRunDistanse) {
            System.out.println("Человек "+name + " пробежал дистанциию длиной " + distance);
            return true;
        } else {
            System.out.println("Человек "+name + " не смог пробежать дистанциию длиной " + distance);
            return false;
        }

    }

    @Override
    boolean jump(Wall height) {
        if (height.length <= maxJumpHeight) {
            System.out.println("Человек "+name + " преодолел стену высотой " + height);
            return true;
        } else {
            System.out.println("Человек "+name + " не смог преодолеть стену высотой " + height);
            return false;
        }
    }
}
