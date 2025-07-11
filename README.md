# Zoo Animal Management System

This is a simple Java console application demonstrating the use of **abstract classes**, **interfaces**, and **inheritance** for managing animals in a zoo.
It allows you to create, view, and manipulate different animal types such as Tiger, Dolphin, and Penguin.
Each animal shares common behavior (eating) and has its own movement capabilities (walking, swimming, or both).

---
## Features

- **Abstract `Animal` base class** implements shared properties and one `Eat` method.  
- **`Eat` interface** declares two methods: `eatingFood()` (implemented in `Animal`) and `eatingCompleted()` (implemented in subclasses).  
- **`Walk` interface** declares `walking()`.  
- **`Swim` interface** declares `swimming()`.  
- **`Tiger`**: walks and eats meat.  
- **`Dolphin`**: swims and eats fish.  
- **`Penguin`**: can both walk and swim, and eats fish.  
- Interactive **menu system** to select an animal and:  
  - Set its properties  
  - Display its properties  
  - Invoke movement (walk/swim)  
  - Invoke eating behavior  

---

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher  
- A terminal or command prompt  

### Installation & Compilation

1. **Clone or download** this repository.  
2. Navigate into the project directory:
   ```bash
   cd virtual-zoo
3. Compile all .java files:
   ```bash
   javac *.java
Running the Application
Run the Main class:
   ```bash
  java Main
```
You will see a two‑level menu:

Main menu: choose an animal (Tiger, Dolphin, Penguin).

Detail menu: for the chosen animal, select one of:

1. Set properties

2. Display properties

3. Display movement (walk or swim)

4. Display eating

Follow the on‑screen prompts to interact with each animal.
```bash
.
├── Animal.java                # Abstract base class
├── Eat.java                   # Interface: eatingFood(), eatingCompleted()
├── Walk.java                  # Interface: walking()
├── Swim.java                  # Interface: swimming()
├── Tiger.java                 # Tiger subclass (Walk + Eat)
├── Dolphin.java               # Dolphin subclass (Swim + Eat)
├── Penguin.java               # Penguin subclass (Walk + Swim + Eat)
└── Main.java                  # Interactive menu system
```
Usage Example
```bash
******* ZOO ANIMAL choice menu ******
1. Tiger
2. Dolphin
3. Penguin
Enter choice of animal: 3
The animal which is chosen is: Penguin

******* ANIMAL details menu for: Penguin ******
1. Set properties
2. Display properties
3. Display movement
4. Display eating
Enter choice (1-4): 1

Is the Penguin swimming? (true/false): true
Enter walking speed (mph): 5
Enter swimming speed (nmph): 20
Enter weight: 30
Enter height: 15
Enter age: 4
Continue with Penguin? (1 = yes, 2 = no): 1

Enter choice (1-4): 3
Penguin: I am swimming at the speed of 20.0 nautical miles per hour
```
Testing
Follow the Usage Example flow for each animal to verify:

Tiger walks and eats meat.

Dolphin swims and eats fish.

Penguin chooses between walking and swimming, and eats fish.

Contributing
Feel free to submit pull requests or open issues to suggest improvements, new animal classes, or additional behaviors!

License

This project is released under the MIT License.
