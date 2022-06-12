package lab_07_02;

import java.security.SecureRandom;

public class Horse extends Animal {
    public Horse() {
        setAnimalType(Horse.class.getSimpleName());
        setSpeed((new SecureRandom()).nextInt(60));
    }
}
