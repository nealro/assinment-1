package com.name.module2_3;

import java.util.Objects;

//This class represents a playing card in a deck of cards//
public class Card {

    //Constructor for Card class//
    Suit suit; //The suit of the card//
    Rank rank; //The rank of the card//

    public Card(Suit suit, Rank rank){
        //Setter for the suit and rank//
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit(){
        //getter for the card's suit//
        return suit;
    }

    public Rank getRank(){
        //getter for the card's rank//
        return rank;
    }

    public CardType getCardType(){
        //Determines if the card is a face card or number card//
        if (rank == Rank.JACK || rank == Rank.QUEEN || rank == Rank.KING)
            return CardType.FACE;
        return CardType.NUMBER;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()){
            return false;
        }
        if (this == obj){
            return true;
        }

        Card otherCard = (Card) obj;
        return (suit == otherCard.suit && rank == otherCard.rank);
    }

    @Override
    public int hashCode() {
        //Hashcode for the suits and ranks of the card
        return Objects.hash(suit, rank);
    }

    @Override
    public String toString() {
        //Returns the string representation of the card//
        return "Card: ["+
                "Suit: "+suit + ", "+
                "Rank: "+rank + ", "+
                "CardType: "+getCardType()+"]";
    }
}