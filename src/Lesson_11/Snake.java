package Lesson_11;

import java.security.SecureRandom;

public class Snake implements MoveAble, FlyAble {
    int speed;
    boolean isFlyAble;

    public Snake() {
        this.speed = new SecureRandom().nextInt(100);
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
