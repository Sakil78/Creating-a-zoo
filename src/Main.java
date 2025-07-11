import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // for getting input
        Scanner keyboard = new Scanner(System.in);
        // TODO 8 Step 1: create the two animal objects
        Tiger tigerObject   = new Tiger();
        Dolphin dolphinObject = new Dolphin();
        Penguin penguinObject = new Penguin();

        // for loop continuation - 1 represents true
        int continueOuterLoop = 1  ;
        int continueInnerLoop;

        // for menu choice
        int menuChoice;

        /** TODO 1: extend the class Animal to create a new
         *          land based animal named "Tiger" which extends
         *          Animal.
         *          Extra properties of class "Tiger" are:
         *          1. number of stripes
         *          2. speed
         *          3. sound level of roar
         *
         **/

        /** TODO 2: extend the class Animal to create a new
         *          water based animal named "Dolphin" which
         *          extends Animal
         *          Extra properties of class "Dolphin" include:
         *          1. color of dolphin
         *          2. swimming speed
         *
         **/


        /** TODO 3: implemement the "Eat" interface in the
         *          "Tiger" class created in the TODO 1
         *          and also in the
         *          "Dolphin" class created in TODO 2.
         **/



        /** TODO 5: implement the "Walk" interface in
         *          "Tiger" class created in the TODO 1
         *          and in the  implementation of the
         *          "walking" method of the interface
         *          display -
         *          " I am walking at the speed "
         *          and join the value of the variable "speed"
         *
         **/

        /** TODO 6: create a new interface named "Swim"
         *          and declaring a method inside it
         *          named "swimming" with the return type
         *          "void"
         **/

        /** TODO 7: implement the "Swim" interface
         *          in the "Dolphin" class and the
         *          "swimming" method in its implementation
         *          should display the swimming speed as
         *          "Dolphin: I am swimming at the speed ...."
         *          where .... is the value of the variable
         *          "swimmingSpeed"
         **/


        /** TODO 8: create a menu system to work with the Animal selected
         *          use the switch provided below
         **/
        do {
            switch (animalChoiceMenu(keyboard)) {
                case 1: // Tiger
                    System.out.println("The animal which is chosen is: " + tigerObject.getNameOfAnimal());
                    continueInnerLoop = 1;
                    do {
                        // Step 2: show details menu for tiger
                        menuChoice = animalDetailsManipulationMenu(keyboard, tigerObject);
                        switch (menuChoice) {
                            case 1: // Set properties
                                System.out.print("Enter number of stripes: ");
                                tigerObject.setNumberOfStripes(keyboard.nextInt());
                                System.out.print("Enter speed (mph): ");
                                tigerObject.setSpeed(keyboard.nextDouble());
                                System.out.print("Enter roar sound level: ");
                                tigerObject.setSoundLevel(keyboard.nextDouble());
                                System.out.print("Enter weight: ");
                                tigerObject.setWeight(keyboard.nextInt());
                                System.out.print("Enter height: ");
                                tigerObject.setHeight(keyboard.nextInt());
                                System.out.print("Enter age: ");
                                tigerObject.setAge(keyboard.nextInt());
                                break;

                            case 2: // Display properties
                                System.out.println("Tiger Properties:");
                                System.out.println(" Number of Stripes: " + tigerObject.getNumberOfStripes());
                                System.out.println(" Speed: " + tigerObject.getSpeed() + " mph");
                                System.out.println(" Roar Sound Level: " + tigerObject.getSoundLevel());
                                System.out.println(" Weight: " + tigerObject.getWeight());
                                System.out.println(" Height: " + tigerObject.getHeight());
                                System.out.println(" Age: " + tigerObject.getAge());
                                break;

                            case 3: // Display movement
                                tigerObject.walking();
                                break;

                            case 4: // Display eating
                                tigerObject.eatingFood();
                                tigerObject.eatingCompleted();
                                break;

                            default:
                                System.out.println("Invalid choice, not supported.");
                        }

                        System.out.println("Continue with Tiger? (1 = yes, 2 = no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while (continueInnerLoop == 1);
                    break;

                case 2: // Dolphin
                    System.out.println("The animal which is chosen is: " + dolphinObject.getNameOfAnimal());
                    continueInnerLoop = 1;
                    do {
                        // Step 2: show details menu for dolphin
                        menuChoice = animalDetailsManipulationMenu(keyboard, dolphinObject);
                        switch (menuChoice) {
                            case 1: // Set properties
                                System.out.print("Enter color: ");
                                dolphinObject.setColor(keyboard.next());
                                System.out.print("Enter swimming speed (mph): ");
                                dolphinObject.setSwimmingSpeed(keyboard.nextDouble());
                                System.out.print("Enter weight: ");
                                dolphinObject.setWeight(keyboard.nextInt());
                                System.out.print("Enter height: ");
                                dolphinObject.setHeight(keyboard.nextInt());
                                System.out.print("Enter age: ");
                                dolphinObject.setAge(keyboard.nextInt());
                                break;

                            case 2: // Display properties
                                System.out.println("Dolphin Properties:");
                                System.out.println(" Color: " + dolphinObject.getColor());
                                System.out.println(" Swimming Speed: " + dolphinObject.getSwimmingSpeed() + " nmph");
                                System.out.println(" Weight: " + dolphinObject.getWeight());
                                System.out.println(" Height: " + dolphinObject.getHeight());
                                System.out.println(" Age: " + dolphinObject.getAge());
                                break;

                            case 3: // Display movement
                                dolphinObject.swimming();
                                break;

                            case 4: // Display eating
                                dolphinObject.eatingFood();
                                dolphinObject.eatingCompleted();
                                break;

                            default:
                                System.out.println("Invalid choice, not supported.");
                        }

                        System.out.println("Continue with Dolphin? (1 = yes, 2 = no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while (continueInnerLoop == 1);
                    break;

                case 3: // Penguin (new)
                    System.out.println("The animal which is chosen is: "
                            + penguinObject.getNameOfAnimal());
                    continueInnerLoop = 1;
                    do {
                        menuChoice = animalDetailsManipulationMenu(keyboard, penguinObject);
                        switch (menuChoice) {
                            case 1:  // Set properties
                                System.out.print("Is the Penguin swimming? (true/false): ");
                                penguinObject.setSwimming(keyboard.nextBoolean());
                                System.out.print("Enter walking speed (mph): ");
                                penguinObject.setWalkSpeed(keyboard.nextDouble());
                                System.out.print("Enter swimming speed (nmph): ");
                                penguinObject.setSwimSpeed(keyboard.nextDouble());
                                System.out.print("Enter weight: ");
                                penguinObject.setWeight(keyboard.nextInt());
                                System.out.print("Enter height: ");
                                penguinObject.setHeight(keyboard.nextInt());
                                System.out.print("Enter age: ");
                                penguinObject.setAge(keyboard.nextInt());
                                break;

                            case 2:  // Display properties
                                System.out.println("Penguin Properties:");
                                System.out.println(" Is Swimming: " + penguinObject.isSwimming());
                                System.out.println(" Walk Speed: " + penguinObject.getWalkSpeed() + " mph");
                                System.out.println(" Swim Speed: " + penguinObject.getSwimSpeed() + " nmph");
                                System.out.println(" Weight: " + penguinObject.getWeight());
                                System.out.println(" Height: " + penguinObject.getHeight());
                                System.out.println(" Age: " + penguinObject.getAge());
                                break;

                            case 3:  // Display movement
                                // Ask if swimming or walking
                                if (penguinObject.isSwimming()) {
                                    penguinObject.swimming();
                                } else {
                                    penguinObject.walking();
                                }
                                break;

                            case 4:  // Display eating
                                penguinObject.eatingFood();
                                penguinObject.eatingCompleted();
                                break;

                            default:
                                System.out.println("Invalid choice");
                        }
                        System.out.println("Continue with Penguin? (1 = yes, 2 = no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while (continueInnerLoop == 1);
                    break;

                default:
                    System.out.println("Sorry, no such animal available.");
            }

            System.out.println("Continue main Zoo menu? (1 = yes, 2 = no):");
            continueOuterLoop = keyboard.nextInt();

        } while (continueOuterLoop == 1);

        keyboard.close();
        /** TODO 9: create a class "Penguin" from the "Animal" class **/

        /** TODO 10: integrate the choice to pick a "penguin" in the menu system **/

    }

    private static int animalChoiceMenu(Scanner keyboard) {
        int choiceGivenByUser;

        System.out.println("******* ZOO ANIMAL choice menu ******");
        System.out.println("1. Tiger");
        System.out.println("2. Dolphin");
        System.out.println("3. Penguin");

        System.out.println("Enter choice of animal (1-3):");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;
    }

    private static int animalDetailsManipulationMenu(Scanner keyboard, Animal animal) {
        int choiceGivenByUser;

        System.out.println("******* ANIMAL details menu for: " + animal.getNameOfAnimal() + " ******");
        System.out.println("1. Set properties");
        System.out.println("2. Display properties");
        System.out.println("3. Display movement");
        System.out.println("4. Display eating");

        System.out.println("Enter choice (1-4):");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;

    }
}