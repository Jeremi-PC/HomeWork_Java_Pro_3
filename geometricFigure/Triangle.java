package org.example.geometricFigure;

public class Triangle implements Printable {
    static void selectTriangle(String type, Double lenTriSide1, Double lenTriSide2, Double lenTriSide3) {
        if (lenTriSide1 <= 0 || lenTriSide2 <= 0 || lenTriSide3 <= 0)
            System.out.println("You inputted incorrect value of sides");
        else {
            //c = √(a^2 + b^2 - 2ab * cos(C))
            // Double lenthSide3 = Math.sqrt(Math.pow(lenTriSide1, 2) + Math.pow(lenTriSide2, 2) - 2 * lenTriSide1 * lenTriSide2 * Math.cos(angle));
            //√(s * (s - a) * (s - b) * (s - c))
            double s = (lenTriSide1 + lenTriSide2 + lenTriSide3) / 2;
            double squreTri = Math.sqrt(s * (s - lenTriSide1) * (s - lenTriSide2) * (s - lenTriSide3));
            double perimeter = (lenTriSide1 + lenTriSide2 + lenTriSide3);

            System.out.println("Type " + type);
            System.out.println("Square of triangle: " + squreTri);
            System.out.println("Triangle perimeter: " + perimeter);
            System.out.println("Length of side1:" + lenTriSide1 + "opposite angle: " + countAngle(lenTriSide1, lenTriSide2));
            System.out.println("Length of side1:" + lenTriSide2 + "opposite angle: " + countAngle(lenTriSide2, lenTriSide3));
            System.out.println("Length of side1:" + lenTriSide3 + "opposite angle: " + countAngle(lenTriSide3, lenTriSide1));
        }
    }
     static Double countAngle(Double lenTriSide1, Double lenTriSide2){
        return Math.toDegrees(Math.atan2(lenTriSide1, lenTriSide2));
    }

    @Override
    public void print() {
        System.out.println(" Triangle ");

    }
}
