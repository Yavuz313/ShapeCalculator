# Geometric Shapes Program

This Java program demonstrates basic object-oriented programming principles by implementing a class structure for representing geometric shapes. The program includes the following classes:

- `Shape`: Represents general properties of shapes with methods for calculating area and perimeter.
- `Square`: Inherits from `Shape` and represents a square with specific properties and methods.
- `Circle`: Inherits from `Shape` and represents a circle with specific properties and methods.

## Features

- Each shape class has methods for calculating area and perimeter, along with a display method to print the shape's properties.
- The `Circle` class includes getter and setter methods for accessing and modifying radius, centerX, and centerY, ensuring safe access to the class properties.

## Usage

```java
public class Main {
    public static void main(String[] args) {
        // Create shapes
        Square square1 = new Square(0, 0, 2, 2);
        Square square2 = new Square(1, 1, 4, 4);
        Circle circle1 = new Circle(3, 3, 2);
        Circle circle2 = new Circle(6, 6, 1);

        // Add shapes to a list
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(square1);
        shapes.add(square2);
        shapes.add(circle1);
        shapes.add(circle2);

        // Display shape properties
        for (Shape shape : shapes) {
            shape.display();
            System.out.println("Area: " + shape.area());
            System.out.println("Perimeter: " + shape.perimeter());
            System.out.println();
        }
    }
}
