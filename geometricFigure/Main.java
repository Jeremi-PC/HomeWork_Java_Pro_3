package org.example.geometricFigure;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input type of figure (Circle, Triangle, Rectangle, Pentagon)");
        System.out.println("If you'll input Circle also input 1 parameter radius");
        System.out.println("If you'll input Rectangle also input 2 parameters length sides");
        System.out.println("If you'll input Triangle also input 3 parameters length sides");
        System.out.println("If you'll input Pentagon also input 1 parameter length side");
        String inputData = sc.nextLine();
        ParceData parceData = new ParceData() {};
        ParceData.parceData(inputData);





        }
    }

