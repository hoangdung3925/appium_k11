package Lesson_11;

import Lesson_09.Animal;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class RacingController {
    public void printOutTheWinner(List<MoveAble> moveAbleObjects){

        String maxSpeedName;
        int maxSpeed;
        MoveAble winner = moveAbleObjects.get(0);
        for (MoveAble moveAbleObject : moveAbleObjects) {
            if(moveAbleObject.speed() > winner.speed())
                winner = moveAbleObject;
                maxSpeedName = moveAbleObject.getClass().getSimpleName();
                maxSpeed = moveAbleObject.speed();
                System.out.printf("Winner is %s with speed: %d",maxSpeedName, maxSpeed );
        }
    }

    public static void main(String[] args) {
        Horse horse= new Horse();
        Dog dog = new Dog();
        Tiger tiger = new Tiger();
        Snake snake = new Snake();
        Falcon falcon = new Falcon();
        Sparrow sparrow = new Sparrow();

        ArrayList<FlyAble> Animal = new ArrayList<>();
        Animal.add(horse);
        Animal.add(dog);
        Animal.add(tiger);
        Animal.add(snake);
        Animal.add(falcon);
        Animal.add(sparrow);

        ArrayList<MoveAble> racingAnimal = new ArrayList<>();

        for (FlyAble a : Animal) {
            if (!a.flyAble())
                racingAnimal.add((MoveAble) a);
        }

        new RacingController().printOutTheWinner(racingAnimal);
    }


}
