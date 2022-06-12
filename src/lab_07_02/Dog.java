package lab_07_02;

import java.security.SecureRandom;

public class Dog extends Animal{
    public Dog() {
        setAnimalType(Dog.class.getSimpleName());
        setSpeed((new SecureRandom()).nextInt(60));
    }
}
