package org.example;

public class Cat extends Animal{

    final int maxRunDistanse = 700;
    final int maxJumpHeight = 5;
    public Cat(String name) {
        super(name);
    }

    public Cat() {
        super();
    }

    @Override
    boolean run(Treadmill distance) {

        if (distance.length <= maxRunDistanse) {
            System.out.println("Кот "+name + " пробежал дистанциию длиной " + distance);
            return true;
        } else {
            System.out.println("Кот "+name + " не смог пробежать дистанциию длиной " + distance);
            return false;
        }
    }

    @Override
    boolean jump(Wall height) {
        if (height.length <= maxJumpHeight) {
            System.out.println("Кот "+name + " преодолел стену высотой " + height);
            return true;
        } else {
            System.out.println("Кот "+name + " не смог преодолеть стену высотой " + height);
            return false;
        }
    }
}
