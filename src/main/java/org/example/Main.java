package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();

        int teamCount = 10;
        int difficultyCount = 5;

        List<Creature> challengers = new ArrayList<>();
        for (int i = 0; i < teamCount; i++) {
            switch (rand.nextInt(3)) {
                case 0:
                    challengers.add(new Human("человек_"+Integer.toString(i)));
                    break;
                case 1:
                    challengers.add(new Cat("кот_"+Integer.toString(i)));
                    break;
                case 2:
                    challengers.add(new Robot("робот_"+Integer.toString(i)));
                    break;
            }
        }

        List<Difficulty> difficulties = new ArrayList<>();
        for (int i = 0; i < difficultyCount; i++) {
            switch (rand.nextInt(2)) {
                case 0:
                    difficulties.add(new Treadmill(rand.nextInt(1000)));
                    break;
                case 1:
                    difficulties.add(new Wall(rand.nextInt(5)));
                    break;
            }
        }

        for (Difficulty difficulty: difficulties) {
            List<Creature> toRemove = new ArrayList<>();
            for (Creature challenger: challengers) {
                if (difficulty instanceof Treadmill) {
                    if (!challenger.run((Treadmill)difficulty)) {
                        toRemove.add(challenger);
                    }
                } else {
                    if (!challenger.jump((Wall) difficulty)) {
                        toRemove.add(challenger);
                    }
                }
            }
            for (Creature elem: toRemove) {
                challengers.remove(elem);
            }
        }
        System.out.println("--------\nДо финиша добрались:\n"+challengers);

    }
}