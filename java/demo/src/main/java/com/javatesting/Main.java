package com.javatesting;

import java.util.ArrayList;

class Shape {
    public double area() {
        return 0.0;
    }

    public double perimeter() {
        return 0.0;
    }

    public void display() {
        throw new UnsupportedOperationException("Unimplemented method 'display'");
    }
}

class Square extends Shape {
    private double x1, y1, x2, y2;

    public Square(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double area() {
        double sideLength = Math.abs(x2 - x1);
        return sideLength * sideLength;
    }

    public double perimeter() {
        double sideLength = Math.abs(x2 - x1);
        return 4 * sideLength;
    }

    public void display() {
        System.out.println("Square - Vertices: (" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + ")");
    }
}

class Circle extends Shape {
    private double centerX, centerY, radius;
    private static int circleCount = 0;
    private static int squareCount = 0;

    public Circle(double centerX, double centerY, double radius) {
        if (Math.abs(circleCount - squareCount) > 2) {
            throw new IllegalArgumentException("Circle count exceeds square count by more than 2");
        }

        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        circleCount++;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public void display() {
        System.out.println("Circle - Center: (" + centerX + ", " + centerY + "), Radius: " + radius);
    }
        // Gerekirse getter ve setter metotları ekleyin
        public double getRadius() {
            return radius;
        }
        
        public void setRadius(double radius) {
            if (radius < 0) {
                throw new IllegalArgumentException("Radius cannot be negative.");
            }
            this.radius = radius;
        }
        
        public double getCenterX() {
            return centerX;
        }
        
        public void setCenterX(double centerX) {
            this.centerX = centerX;
        }
        
        public double getCenterY() {
            return centerY;
        }
        
        public void setCenterY(double centerY) {
            this.centerY = centerY;
        } 

}

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        // Example usage
        Square square1 = new Square(0, 0, 2, 2);
        Square square2 = new Square(1, 1, 4, 4);

        Circle circle1 = new Circle(3, 3, 2);
        Circle circle2 = new Circle(6, 6, 1);

        shapes.add(square1);
        shapes.add(square2);
        shapes.add(circle1);
        shapes.add(circle2);

        
        for (Shape shape : shapes) {
            shape.display();
            System.out.println("Area: " + shape.area());
            System.out.println("Perimeter: " + shape.perimeter());
            System.out.println();
        }
    }
}
