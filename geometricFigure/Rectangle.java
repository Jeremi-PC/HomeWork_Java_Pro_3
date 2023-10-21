package org.example.geometricFigure;

public class Rectangle implements Printable {
    static void selectRectangle(String type, Double lenRecSide1, Double lenRecSide2) {
        if (lenRecSide1 <= 0 || lenRecSide2 <= 0) System.out.println("You inputted incorrect value of sides");
        else {
            double perimetrRec = (lenRecSide1 + lenRecSide2) * 2;
            double squreRec = lenRecSide1 * lenRecSide2;
            //c = √(a^2 + b^2)
            double diagonal = Math.sqrt(lenRecSide1 * lenRecSide1 + lenRecSide2 * lenRecSide2);
            double length = Math.max(lenRecSide1, lenRecSide2);
            double width = Math.min(lenRecSide1, lenRecSide2);

            System.out.println("Type " + type);
            System.out.println("Square of rectangle: " + squreRec);
            System.out.println("Rectangle perimeter: " + perimetrRec);
            System.out.println("Rectangle diagonal: " + diagonal);
            System.out.println("Rectangle length: " + length);
            System.out.println("Rectangle width: " + width);

        }
    }
    @Override
    public void print() {
        System.out.println(" Rectangle ");
    }
}

