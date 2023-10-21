package org.example.months;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name of month: ");
        String inputMonth = scanner.nextLine().toUpperCase();

        try {
            Month month = Month.valueOf(inputMonth);
            System.out.println("Season: "+month.getSeason()+ "; Average temperature: "+ month.getTemperature());

        }
        catch (IllegalArgumentException e){
            System.out.println("Incorrect data");
        }



    }
}