package lab_07_02;

import java.security.SecureRandom;

public class Tiger extends Animal {
    public Tiger() {
        setAnimalType(Tiger.class.getSimpleName());
        setSpeed((new SecureRandom()).nextInt(60));
    }
}
