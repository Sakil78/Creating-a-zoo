// Dolphin.java
public class Dolphin extends Animal {
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

    // Implement the second Eat interface method
    @Override
    public void eatingCompleted() {
        System.out.println(getNameOfAnimal() + " has finished eating.");
    }
}