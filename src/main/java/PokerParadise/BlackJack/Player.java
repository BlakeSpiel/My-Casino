package PokerParadise.BlackJack;

import PokerParadise.Cards;

import java.util.ArrayList;

public class Player{

    protected final ArrayList<Cards.Card> hand = new ArrayList<>();

    public int myTotal(){
        int ace = 0;
        int sum = 0;

        for(int i = 0; i < hand.size(); i++ ){

            int card = hand.get(i).getNum();
            if (card == 1 && sum + 11 <= 21){
                ace++;
                sum += 11;
            } else if (ace == 1 && card == 1 && sum + card > 21){
                ace++;
                sum += card;
                sum -= 10;
            } else {
                sum += card;
            }
        }
        return sum;
    }

    public void resetHand(){
        hand.clear();
    }

    public void drawCard(Cards cardDeck, int numCards){
        for (int i = 0; i < numCards; i++){
            hand.add(cardDeck.dealCard());
        }
    }

    public Cards.Card getCard(int index){
        return hand.get(index);
    }

    public Cards.Card getLastCard(){
        return hand.get(hand.size()-1);
    }

    public String showHand() {
        String handString = "";
        for(int i = 0; i < hand.size(); i++){
            handString += (hand.get(i)+ " ");
        }
        return handString;
    }
}
