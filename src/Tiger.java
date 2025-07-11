// Tiger.java
public class Tiger extends Animal implements Eat, Walk {
    private int numberOfStripes;
    private double speed;
    private double soundLevel;

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

    public double getSoundLevel() {
        return soundLevel;
    }
    public void setSoundLevel(double soundLevel) {
        this.soundLevel = soundLevel;
    }

    // Walking functionality (from Walk interface)
    @Override
    public void walking() {
        System.out.println("Tiger: I am moving at the speed of " + speed + " mph");
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