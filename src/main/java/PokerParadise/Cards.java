package PokerParadise;

import java.util.Collections;
import java.util.Stack;

public class Cards {
    Stack<Card> deck;

    public Cards(){
        createDeck();
    }

    public class Card {
        final String suit;
        final String face;
        final int num;


        public Card(String suit, String face, int num) {
            this.suit = suit;
            this.face = face;
            this.num = num;
        }

        public int getNum(){
            return num;
        }

        public String toString() {
            return face + " of " + suit;
        }
    }

    void createDeck() {
        deck = new Stack<>();

        int index = 1;
        String suit;
        String face;
        int num;

        while (index <= 52) {
            if (index <= 13) {
                suit = "Diamonds";
                num = index;
            } else if (index <= 26) {
                suit = "Hearts";
                num = index - 13;
            } else if (index <= 39) {
                suit = "Clubs";
                num = index - 26;
            } else {
                suit = "Spades";
                num = index - 39;
            }

            if (num == 1) face = "Ace";
            else if (num == 11) face = "Jack";
            else if (num == 12) face = "Queen";
            else if (num == 13) face = "King";
            else face = String.valueOf(num);

            if (num > 10) {
                num = 10;
            }

            deck.add(new Card(suit, face, num));
            index = index + 1;
        }
        Collections.shuffle(deck);
    }
    public Card dealCard() {
        return deck.pop();
    }
}