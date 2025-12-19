package PokerParadise;

import PokerParadise.BlackJack.Player;

import java.util.Collections;
import java.util.Stack;

public class Card{
    final String suit;
    final String face;
    final int num;


    public Card(String suit, String face, int num){
        this.suit = suit;
        this.face = face;
        this.num = num;
    }

    public int getNum () {
        return num;
    }

    public String getSuit () {
        return suit;
    }

    public String getFace () {
        return face;
    }
}