package Lesson_11;

import java.security.SecureRandom;

public class Dog implements MoveAble, FlyAble {

    String name;
    int speed;
    boolean isFlyAble;

    public Dog() {
        this.speed = new SecureRandom().nextInt(60);
        this.isFlyAble = flyAble();
    }

    @Override
    public int speed() {
        return speed;
    }

    @Override
    public boolean flyAble() {
        return false;
    }

}
