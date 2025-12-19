package PokerParadise.BlackJack;

import PokerParadise.*;

import java.util.Objects;


public class BlackJack {
    Deck deck = new Deck();
    Player player = new Player();
    Player dealer = new Player();

    public BlackJack() {
        deal();
    }


    void resetGame(){
        player.resetHand();
        dealer.resetHand();
        deal();
    }

    //THE DEAL
    private void deal(){
        deck.dealCards(player, 2);
        deck.dealCards(dealer, 2);

        System.out.println("Dealer draws: " + dealer.getCard(0));
        System.out.println("Player draws: " + player.getCard(0).getNum() + "and" + player.getCard(1).getNum());
    }


    //FINDS THE WINNER
    private void whoWins() {
        int pTotal = player.myTotal();
        int dTotal = dealer.myTotal();

        System.out.println(pTotal);
        System.out.println(dTotal);

        if (pTotal <= 21) {
            if (pTotal > dTotal || dTotal > 21) {
                Bank.win();
            } else if (pTotal == dTotal) {
                Bank.tie();
            }
        }
        resetGame();
    }

    //PLAYERS TURN
    public void playerHit() {
        if (player.myTotal() >= 21){
            deck.dealCard(player);
            playerStand();
            return;
        }
        deck.dealCard(player);
        System.out.println(player.getLastCard());

        if (player.myTotal() >= 21){
            playerStand();
        }
    }
    public void playerStand(){
        dealerTurn();
        whoWins();
    }
    public void playerSplit(){
        if (player.getSize() == 2 && Objects.equals(player.getCard(0).getFace(), player.getCard(1).getFace())){

        }
    }

    //DEALERS TURN TO PLAY
    private void dealerTurn() {
        while (dealer.myTotal() < 17) {
            deck.dealCard(dealer);
            System.out.println(dealer.getLastCard());
        }
    }
}