package com.name.module2_3;

import java.util.Comparator;import java.util.Comparator;


    //This class provides a comparison method for Card objects based on their suit//
    public class SuitComparator implements Comparator<Card>{

        @Override
        public int compare(Card o1, Card o2) {
            return o1.suit.getValue() - o2.suit.getValue();
        }
}
