package com.name.module2_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    //This class represents a program that reads a text file and extracts unique words from it

    public static void main(String[] args) {
        File file = new File("illiad.txt"); //Get the file "illiad.txt"
        Set<String> uniqueWords = new HashSet<>(); //Create a set to store unique words

        try (Scanner scanner = new Scanner(file)) { //The method that finds all the unique words
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.split("[^a-zA-Z']+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        String normalized = word.toLowerCase();
                        uniqueWords.add(normalized);
                    }
                }
            }

            System.out.println("There are " + uniqueWords.size() + " unique words in the Illiad."); //Print out the total number of unique words found in the file
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + file.getAbsolutePath()); //If there is an error reading the file, print an error message
        }
    }
}