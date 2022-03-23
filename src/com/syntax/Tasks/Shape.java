package com.syntax.Tasks;

public interface Shape {
    //Task#1
    double calculateArea();

    double calculatePerimeter();
}

class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Square implements Shape {
    double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double calculateArea() {
        return Math.pow(a, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 4 * a;
    }
}

class ShapeTest {
    public static void main(String[] args) {
        Shape circle = new Circle(3);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());
        Shape square = new Square(4);
        System.out.println(square.calculateArea());
        System.out.println(square.calculatePerimeter());
    }
}
