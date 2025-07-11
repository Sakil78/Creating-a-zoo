// Tiger.java
public class Tiger extends Animal {
    private int numberOfStripes;
    private double speed;
    private double soundLevelOfRoar;

    // Default constructor sets the inherited name field to "Tiger"
    public Tiger() {
        super("Tiger");
    }

    // Getters and setters
    public int getNumberOfStripes() {
        return numberOfStripes;
    }
    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    public double getSpeed() {
        return speed;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSoundLevelOfRoar() {
        return soundLevelOfRoar;
    }
    public void setSoundLevelOfRoar(double soundLevelOfRoar) {
        this.soundLevelOfRoar = soundLevelOfRoar;
    }

    // Implement the second Eat interface method
    @Override
    public void eatingCompleted() {
        System.out.println(getNameOfAnimal() + " has finished eating.");
    }
}