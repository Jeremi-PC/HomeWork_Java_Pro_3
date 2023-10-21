package org.example.geometricFigure;

public class Circle implements Printable {

    static void selectCircle(String type, Double radius) {
        if (radius <= 0) System.out.println("You inputted incorrect value of radius");
        else {
            double lenthCircle = 2 * Math.PI * radius;
            double sqaureCircle = Math.PI * radius * radius;
            double diameter = radius * 2;

            System.out.println("Type " + type);
            System.out.println("Square of circle: " + sqaureCircle);
            System.out.println("Length of circle: " + lenthCircle);
            System.out.println("Radius of circle: " + radius);
            System.out.println("Diameter of circle: " + diameter);

        }
    }

    @Override
    public void print() {
        System.out.println(" Circle ");
    }
}
