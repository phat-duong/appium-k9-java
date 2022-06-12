package lab_08;

public class Animal {
    private String name;
    private int speed;
    private boolean flyable;

    public Animal() {
    }

    public Animal(Builder builder){
        name = builder.name;
        speed = builder.speed;
        flyable = builder.flyable;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isFlyable() {
        return flyable;
    }

    public static class Builder{
        private String name = "eagle";
        private int speed = 1;
        private boolean flyable = true;

        public Builder withAnimalType(String name){
            this.name = name;
            return this;
        }

        public Builder withSpeed(int speed){
            this.speed = speed;
            return this;
        }

        public Builder withFlyAble(boolean flyable){
            this.flyable = flyable;
            return this;
        }
        public Animal build(){
            return new Animal(this);
        }
    }
}
