package com.name.module2_3;

import java.util.Comparator;

/**
 This comparator compares two cards based on whether they are face cards or not.
 This comparator returns -1 if the first card is a face card and the second card is not, 1 if the second card is a face
 card and the first card is not, and 0 if both cards are face cards or both are not face cards.
 */
public class RankComparator implements Comparator<Card> {

//Compares two cards based on whether they are face cards or not.//

    @Override
    public int compare(Card card1, Card card2) {
        return card1.rank.getValue() - card2.rank.getValue();
    }
}