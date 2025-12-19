package PokerParadise.BlackJack;

import PokerParadise.Card;

import java.util.ArrayList;

public class Player{

    public final ArrayList<Card> hand = new ArrayList<>();

    public int myTotal(){
        boolean ace = false;
        int sum = 0;

        for (int i = 0; i < getSize(); i++){
            int currCard = getCard(i).getNum();
            if(currCard == 1){
                ace = true;
            }
            sum += currCard;
        }

        if(ace && sum + 10 <= 21){
            sum += 10;
        }
        return sum;
    }

    //ACTION
    public void resetHand(){
        hand.clear();
    }

    //GETTERS
    public int getSize(){
        return hand.size();
    }
    public Card getCard(int index){
        return hand.get(index);
    }
    public Card getLastCard(){
        return hand.get(hand.size()-1);
    }
}
