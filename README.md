Name: Micah Phillip

Course: Advanced Java Programming

CRN: COP-2805C

Program Name: Food-Container-Generics-Demo

Description: This Java program demonstrates the use of generics with a simple food container system. It models different types of food items (Fruit, Vegetable, and Bread) that all extend a base class (Food). A generic container class (GenericContainer<T extends Food>) is then used to store and display these items. The program emphasizes object-oriented programming and type safety with generics while showcasing basic list operations.

Key Concepts and Tools Used

Object-Oriented Programming (Food, Fruit, Vegetable, Bread, GenericContainer classes)

Generics with bounded type parameters (T extends Food)

Java Collections Framework (ArrayList for item storage)

Polymorphism through method overriding (toString)

Encapsulation via private fields and getters

How It Works
The demo program (GenericsDemo) executes the following steps:
Create instances of food items: fruits (apple, orange), vegetables (carrot, spinach), and breads (baguette, sourdough).
Instantiate a generic container that can hold Food objects.
Add all created food items into the container.
Display all items currently stored in the container.

Inputs and Outputs

Inputs: Hardcoded Food objects created in the program (Apple, Orange, Carrot, Spinach, Baguette, Sourdough).

Outputs: Confirmation messages when items are added to the container.
A formatted list of all items in the container.

# Food-Container-Generics-Demo
