package Lesson_11;

import java.security.SecureRandom;

public class Tiger implements MoveAble, FlyAble {

    int speed;
    boolean isFlyAble;

    public Tiger() {
        this.speed = new SecureRandom().nextInt(90);
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
