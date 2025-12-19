package PokerParadise;

import PokerParadise.BlackJack.Player;

import java.util.Collections;
import java.util.Stack;

public class Deck {
    Stack<Card> deck;

    public Deck(){
        createDeck();
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

    public void dealCard(Player player) {
        player.hand.add(deck.pop());
    }

    public void dealCards(Player player, int numCards) {
        for (int i = 0; i < numCards; i++) {
            player.hand.add(deck.pop());
        }
    }
}
