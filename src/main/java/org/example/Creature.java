package org.example;

public abstract class Creature {

    protected String name;

    public Creature(String name) {
        this.name = name;
    }

    public Creature() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @apiNote метод преодоления беговой дорожки
     * @param distance беговая дорожка
     * @return булево, признак пройдено ли препятсвие
     */
    abstract boolean run(Treadmill distance);

    /**
     * @apiNote метод преодоления стены
     * @param height стена
     * @return булево, признак пройдено ли препятсвие
     */
    abstract boolean jump(Wall height);

    @java.lang.Override
    public String toString() {
        return name;
    }
}
