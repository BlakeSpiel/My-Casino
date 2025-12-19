package PokerParadise.BlackJack;

import PokerParadise.*;


public class BlackJack {
    Cards deck = new Cards();
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
        player.drawCard(deck, 2);
        dealer.drawCard(deck, 2);

        System.out.println("Dealer draws: " + dealer.getCard(1));
        System.out.println("Player draws: " + player.showHand());
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
            playerStand();
            return;
        }

        player.drawCard(deck, 1);
        System.out.println(player.getLastCard());

        if (player.myTotal() >= 21){
            playerStand();
        }
    }
    public void playerStand(){
        dealerTurn();
        whoWins();
    }

    //DEALERS TURN TO PLAY
    private void dealerTurn() {
        while (dealer.myTotal() < 17) {
            dealer.drawCard(deck, 1);
            System.out.println(dealer.getLastCard());
        }
    }
}