package com.name.module2_3;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Card h7 = new Card(Suit.HEARTS, Rank.SEVEN);
        Card h8 = new Card(Suit.HEARTS, Rank.EIGHT);
        Card h9 = new Card(Suit.HEARTS, Rank.NINE);
        ArrayList<Card> cards = new ArrayList<Card>();
        cards.add(h8);
        cards.add(h7);
        cards.add(h9);
        Collections.sort(cards, new RankComparator());
        System.out.println("First is "+cards.get(0));
        System.out.println("Second is "+cards.get(1));
        System.out.println("Third is "+cards.get(2));

        Card s1 = new Card(Suit.SPADE, Rank.ACE);
        Card c1 = new Card(Suit.CLUBS, Rank.ACE);
        Card h1 = new Card(Suit.HEARTS, Rank.ACE);
        Card d1 = new Card(Suit.DIAMOND, Rank.ACE);
        ArrayList<Card> cardsBySuit = new ArrayList<Card>();
        cardsBySuit.add(h1);
        cardsBySuit.add(c1);
        cardsBySuit.add(d1);
        cardsBySuit.add(s1);;
        Collections.sort(cardsBySuit, new SuitComparator());
        System.out.println("First suit is "+cardsBySuit.get(0));
        System.out.println("Second suit is "+cardsBySuit.get(1));
        System.out.println("Third suit is "+cardsBySuit.get(2));
        System.out.println("Forth suit is "+cardsBySuit.get(3));

    }
}
