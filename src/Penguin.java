// Penguin.java
public class Penguin extends Animal implements Eat, Walk, Swim {
    private boolean isSwimming;
    private double walkSpeed;
    private double swimSpeed;

    // Default constructor sets the inherited name field to "Penguin"
    public Penguin() {
        super("Penguin");
    }

    // Getter and setter for isSwimming
    public boolean isSwimming() {
        return isSwimming;
    }
    public void setSwimming(boolean isSwimming) {
        this.isSwimming = isSwimming;
    }

    // Getter and setter for walkSpeed
    public double getWalkSpeed() {
        return walkSpeed;
    }
    public void setWalkSpeed(double walkSpeed) {
        this.walkSpeed = walkSpeed;
    }

    // Getter and setter for swimSpeed
    public double getSwimSpeed() {
        return swimSpeed;
    }
    public void setSwimSpeed(double swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    // Walk interface implementation
    @Override
    public void walking() {
        System.out.println("Penguin: I am walking at the speed of " + walkSpeed + " mph");
    }

    // Swim interface implementation
    @Override
    public void swimming() {
        System.out.println("Penguin: I am swimming at the speed of " + swimSpeed + " nautical miles per hour");
    }

    // Override eatingFood to reflect fish diet
    @Override
    public void eatingFood() {
        System.out.println("Penguin: I am eating fish");
    }

    // Implement the remaining Eat method
    @Override
    public void eatingCompleted() {
        System.out.println("I have eaten fish");
    }
}
