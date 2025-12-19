package PokerParadise;

import PokerParadise.BlackJack.BlackJack;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MenuController {
    private BlackJack game;


    @FXML
    public void initialize() {
        game = new BlackJack();
    }

    @FXML
    private Label cash;



    @FXML
    private void onHit(){
        System.out.println("HIT");
        game.playerHit();
    }
    @FXML
    private void onStand(){
        System.out.println("STAND");
        game.playerStand();
    }
    @FXML
    private void onDouble(){
        System.out.println("DOUBLE");
        game.playerStand();
    }
    @FXML
    private void onSplit(){
        System.out.println("SPLIT");
        game.playerStand();
    }
    @FXML
    private void onCash(){
        System.out.println("CASH");
        game.playerStand();
    }




}
