package org.example.geometricFigure;

public abstract class ParceData {


    public static void parceData(String str) {
        String[] parameters = str.split(" ");
        if (parameters[0].equals("Circle") || parameters[0].equals("Triangle") || parameters[0].equals("Rectangle") || parameters[0].equals("Pentagon")) {
            switch (parameters[0]) {
                case "Circle" -> {
                    Circle.selectCircle(parameters[0], Double.valueOf(parameters[1]));
                    Circle circle = new Circle();
                    circle.print();
                }
                case "Rectangle" -> {
                    Rectangle.selectRectangle(parameters[0], Double.valueOf(parameters[1]), Double.valueOf(parameters[2]));
                    Rectangle rectangle = new Rectangle();
                    rectangle.print();
                }
                case "Triangle" -> {
                    Triangle.selectTriangle(parameters[0], Double.valueOf(parameters[1]), Double.valueOf(parameters[2]), Double.valueOf(parameters[3]));
                    Triangle triangle = new Triangle();
                    triangle.print();
                }
                case "Pentagon" -> {
                    Pentagon.selectPentagon(parameters[0], Double.valueOf(parameters[1]));
                    Pentagon pentagon = new Pentagon();
                    pentagon.print();
                }
                default -> throw new IllegalStateException("Unexpected value: " + parameters[0]);
            }
        } else System.out.println("Incorrect type of figure");
    }
}
