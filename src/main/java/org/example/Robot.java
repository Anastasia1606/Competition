package org.example;

public class Robot extends Inanimate{

    final int maxRunDistanse = 500;
    final int maxJumpHeight = 2;
    public Robot(String name) {
        super(name);
    }

    public Robot() {
        super();
    }

    @Override
    boolean run(Treadmill distance) {

        if (distance.length <= maxRunDistanse) {
            System.out.println("Робот "+name + " пробежал дистанциию длиной " + distance);
            return true;
        } else {
            System.out.println("Робот "+name + " не смог пробежать дистанциию длиной " + distance);
            return false;
        }
    }

    @Override
    boolean jump(Wall height) {
        if (height.length <= maxJumpHeight) {
            System.out.println("Робот "+name + " преодолел стену высотой " + height);
            return true;
        } else {
            System.out.println("Робот "+name + " не смог преодолеть стену высотой " + height);
            return false;
        }
    }
}