package Lesson_11;

import java.security.SecureRandom;
public class Horse implements MoveAble, FlyAble  {
    int speed;
    boolean isFlyAble;

    public Horse() {
        this.speed = new SecureRandom().nextInt(75);
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
