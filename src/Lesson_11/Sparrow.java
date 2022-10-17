package Lesson_11;

public class Sparrow implements MoveAble, FlyAble{
    boolean isFlyAble;

    public Sparrow() {
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
