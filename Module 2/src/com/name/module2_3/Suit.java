package com.name.module2_3;

// This enum represents the four suits in a deck of playing cards: clubs, diamonds, hearts, and spades//
public enum Suit {
    SPADE(1), HEARTS(2), CLUBS(3), DIAMOND(4);

    private int value;

    private  Suit(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}