package PokerParadise;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Menu extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        new Cards();
        //Setting the stage
        FXMLLoader blackJackGUI = new FXMLLoader(getClass().getResource("/BlackJack.fxml"));
        Scene blackJack = new Scene(blackJackGUI.load(), 1280, 720);

        //FXMLLoader menuGUI = new FXMLLoader(getClass().getResource("/Slot.fxml"));
        //Scene menu = new Scene(menuGUI.load(), 1280, 720);

        //FXMLLoader bankGUI = new FXMLLoader(getClass().getResource("/BlackJack.fxml"));
        //Scene bank = new Scene(bankGUI.load(), 1280, 720);

        stage.setResizable(false);
        stage.setTitle("Poker Paradise");
        stage.setScene(blackJack);
        stage.show();
    }
}
