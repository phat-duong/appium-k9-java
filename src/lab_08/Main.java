package lab_08;

import java.security.SecureRandom;
import java.util.ArrayList;

public class Main {

    public static void checkWinner(ArrayList<Animal> animalList){
        Animal winner = new Animal.Builder().withAnimalType("winner").withSpeed(0).withFlyAble(false).build();
        ArrayList<Animal> reWinner = new ArrayList<>();
        reWinner.add(winner);

        for (int i=1; i<animalList.size(); i++) {
            if(animalList.get(i).isFlyable())
                continue;
            if (animalList.get(i).getSpeed() > winner.getSpeed()) {
                winner = animalList.get(i);
                reWinner.clear();
                reWinner.add(winner);
            }
        }
        System.out.println("Result is:");
        if(reWinner.size()==1){
            if(reWinner.get(0).getName().equals("winner"))
                System.out.println("All animals are flyable");
            else
                System.out.printf("The winner is %s with speed: %d km/h", reWinner.get(0).getName(), reWinner.get(0).getSpeed());
            return;
        }
    }

    public static void main(String[] args) {
        Animal eagle = new Animal.Builder().withAnimalType("Eagle").withSpeed(new SecureRandom().nextInt(60))
                .withFlyAble(true).build();
        Animal falcon = new Animal.Builder().withAnimalType("Falcon").withSpeed(new SecureRandom().nextInt(60))
                .withFlyAble(true).build();
        Animal tiger = new Animal.Builder().withAnimalType("Tiger").withSpeed(new SecureRandom().nextInt(60))
                .withFlyAble(false).build();
        Animal snake = new Animal.Builder().withAnimalType("Snake").withSpeed(new SecureRandom().nextInt(60))
                .withFlyAble(false).build();

        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(eagle);
        animalList.add(falcon);
        animalList.add(tiger);
        animalList.add(snake);
        checkWinner(animalList);
    }
}
