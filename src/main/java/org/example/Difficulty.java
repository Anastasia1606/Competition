package org.example;

public abstract class Difficulty {

    protected int length;

    public Difficulty(int length) {
        this.length = length;
    }

    public int getDistance() {
        return length;
    }

    @Override
    public String toString() {
        return Integer.toString(length);
    }
}
