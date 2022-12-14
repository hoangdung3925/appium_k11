package Lesson_10;

import java.util.ArrayList;

public class Winner {
    public static void main(String[] args) {

        Horse horse= new Horse();
        Dog dog = new Dog();
        Tiger tiger = new Tiger();

        ArrayList<Animal> animals= new ArrayList<>();

        animals.add(horse);
        animals.add(dog);
        animals.add(tiger);

        int maxSpeed = animals.get (0).getSpeed();
        String maxSpeedName = animals.get(0).getClass().getSimpleName();

        for(int i = 1; i <= animals.size()-1; i++){
            if (animals.get(i).getSpeed() > maxSpeed){
                maxSpeed = animals.get(i).getSpeed();
                maxSpeedName = animals.get(i).getClass().getSimpleName();
            }
        }
        System.out.printf("Winner is %s with speed: %d",maxSpeedName, maxSpeed );
    }
}
