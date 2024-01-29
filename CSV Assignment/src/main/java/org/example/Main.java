package org.example;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CsvHandler csvHandler = new CsvHandler();
        csvHandler.addHeader("Name");
        csvHandler.addHeader("Occupation");
        csvHandler.addHeader("Age");

        System.out.println("Do you want to START typing?");
        Scanner scanner = new Scanner(System.in);
        String ans = scanner.next();

        while (!ans.equals("no")) {
            for(int i = 0; i < 1; i++){
                System.out.println("Please ENTER Name: ");
                Scanner scanner1 = new Scanner(System.in);
                String name = scanner1.next();

                System.out.println("Please ENTER Occupation: ");
                Scanner scanner2 = new Scanner(System.in);
                String occupation = scanner2.next();

                System.out.println("Please ENTER Age: ");
                Scanner scanner3 = new Scanner(System.in);
                String age = scanner3.next();

                List<String> row1 = List.of(name, occupation, age);
                csvHandler.addRow(row1);

                try {
                    csvHandler.writeToFile("Data.csv");
                } catch (IOException e) {
                    e.printStackTrace();
                }

                try {
                    csvHandler.readFromFile("Data.csv");
                    while (csvHandler.hasMoreRows()) {
                        List<String> row = csvHandler.getNextRow();
                        System.out.println(row);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("Do you wish to CONTINUE? (TYPE 'no' IF YOU DON'T WANT TO CONTINUE)");
                ans = scanner.next();
            }
        }
    }
}
