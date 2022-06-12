package lab_07_02;

public class Animal{
    private String animalType;
    private int speed;

    public Animal() {
    }

    public Animal(String animalType, int speed) {
        this.animalType = animalType;
        this.speed = speed;
    }

    public String getAnimalType() {
        return this.animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int speed() {
        return this.getSpeed();
    }
}
