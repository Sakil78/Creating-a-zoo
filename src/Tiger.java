// Tiger.java
public class Tiger extends Animal implements Eat, Walk {
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

    // Walking functionality (from Walk interface)
    @Override
    public void walk() {
        System.out.println(getNameOfAnimal() + " is walking on land at speed " + speed + ".");
    }

    // Eat interface methods
    @Override
    public void eatingFood() {
        // Inherited behavior is fine, or customize if desired:
        super.eatingFood(); // prints "The animal: Tiger is eating."
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Tiger: I have eaten meat");
    }
}