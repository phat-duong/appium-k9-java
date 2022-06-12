package lab_07_02;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void checkWinner(ArrayList<Animal> animalList) {
        Animal winner = (Animal)animalList.get(0);
        ArrayList<Animal> reWinner = new ArrayList();
        reWinner.add(winner);

        for(int i = 1; i < animalList.size(); ++i) {
            if (((Animal)animalList.get(i)).speed() > winner.speed()) {
                winner = (Animal)animalList.get(i);
                reWinner.clear();
                reWinner.add(winner);
            }
        }

        if (reWinner.size() > 1) {
            System.out.printf("there are %d winners:", reWinner.size());
        }

        Iterator iterator = reWinner.iterator();

        while(iterator.hasNext()) {
            Animal i = (Animal)iterator.next();
            System.out.printf("Winner is <%s>, with speed: <%d>\n", i.getAnimalType(), i.getSpeed());
        }

    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal horse = new Horse();
        Animal tiger = new Tiger();

        ArrayList<Animal> animalList = new ArrayList();
        animalList.add(dog);
        animalList.add(horse);
        animalList.add(tiger);
        checkWinner(animalList);
    }
}
