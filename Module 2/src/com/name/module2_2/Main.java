package com.name.module2_2;

import java.util.LinkedList;

public class Main {
    //Creates a suffled deck//
    public static void main(String[] args) {
        Deck test = new Deck();
        LinkedList<Card> seven = test.pollSeven();
        for(Card c : seven) {
            System.out.println(c);
        }
        System.out.println(test);
    }
}
