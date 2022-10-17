package Lesson_11;

public class Falcon implements MoveAble, FlyAble {

    boolean isFlyAble;

    public Falcon() {
        this.isFlyAble = isFlyAble;
    }

    @Override
    public int speed() {
        return 0;
    }

    @Override
    public boolean flyAble() {
        return true;
    }

}
