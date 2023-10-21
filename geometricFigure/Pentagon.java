package org.example.geometricFigure;

public class Pentagon implements Printable {
    static void selectPentagon(String type, Double lenPentSide) {
        if (lenPentSide <= 0) System.out.println("You inputted incorrect value of sides");
        else {
            double perimetrPent = lenPentSide * 5;
            double squrePent = 1.720477400588967 * lenPentSide * lenPentSide;

            System.out.println("Type " + type);
            System.out.println("Length of side: " + lenPentSide);
            System.out.println("Perimeter of side: " + perimetrPent);
            System.out.println("Square of pentagon: " + squrePent);
        }
    }

    @Override
    public void print() {
        System.out.println(" Pentagon ");

    }
}
