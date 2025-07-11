// Dolphin.java
public class Dolphin extends Animal implements Eat, Swim {
    private String color;
    private double swimmingSpeed;

    // Default constructor sets the inherited name field to "Dolphin"
    public Dolphin() {
        super("Dolphin");
    }

    // Getters and setters
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public double getSwimmingSpeed() {
        return swimmingSpeed;
    }
    public void setSwimmingSpeed(double swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    // Swimming functionality (from Swim interface)
    @Override
    public void swimming() {
        System.out.println("Dolphin: I am swimming at the speed of " + swimmingSpeed + " nautical miles per hour");
    }

    // Customize eatingFood() behavior
    @Override
    public void eatingFood() {
        System.out.println("Dolphin: I am eating delicious fish");
    }

    // Implement the remaining Eat method
    @Override
    public void eatingCompleted() {
        System.out.println("I have eaten fish");
    }
}