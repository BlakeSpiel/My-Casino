/* package PokerParadise.BlackJack;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Menu extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        //Setting the stage
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/BlackJack.fxml"));

        Parent root = loader.load();
        Scene blackJack = new Scene(root, 1280, 720);

        Pane startPane = new Pane(payText(), payButtons());
        payText();
        Scene startMenu = new Scene(startPane, 1280, 720);
        startMenu.getStylesheets().add(getClass().getResource("/main.css").toExternalForm());

        Pane payPane = new Pane(payText());
        Scene payMenu = new Scene(payPane, 1280, 720);
        payMenu.getStylesheets().add(getClass().getResource("/main.css").toExternalForm());

        Pane blackJackPane = new Pane(payText());
        Scene blackJackMenu = new Scene(blackJackPane, 1280, 720);
        blackJackMenu.getStylesheets().add(getClass().getResource("/main.css").toExternalForm());


        stage.setResizable(false);
        stage.setTitle("Poker Paradise");
        stage.setScene(blackJack);
        stage.show();
    }


    //PAY MENU SCREEN
    private VBox payText(){
        Label guidingMessage = new Label("Welcome to Poker Paradise");
        Label feedbackLabel = new Label("DUMMY TEXT");
        VBox vbox = new VBox(10, guidingMessage, feedbackLabel);
        return vbox;
    }
    private HBox payButtons(){
        Button hitButton = new Button("HIT");
        Button standButton = new Button("STAND");
        HBox hbox = new HBox(10, hitButton, standButton);

        hitButton.setOnAction(e -> {
            System.out.println("Place Bet");
        });
        standButton.setOnAction(e -> {
            System.out.println("STAND");
        });

        return hbox;
    }




    void create(){
        Label guidingMessage = new Label("Welcome to Poker Paradise");
        Label feedbackLabel = new Label("DUMMY TEXT");
        feedbackLabel.setPrefSize(100, 100);
        VBox vbox = new VBox(10, guidingMessage, feedbackLabel);
        vbox.setAlignment(Pos.TOP_CENTER);

        TextField importField = new TextField();
        Label cashLabel = new Label("You have: ");
        importField.setPrefWidth(50);
        Pane cashBox = new Pane(cashLabel, importField);
        cashBox.setLayoutX(0);
        cashBox.setLayoutY(100);


        Button hitButton = new Button("HIT");
        Button standButton = new Button("STAND");
        hitButton.setPrefSize(200, 70);
        standButton.setPrefSize(200, 70);
        HBox hbox = new HBox(10, hitButton, standButton);
        hbox.setAlignment(Pos.BOTTOM_CENTER);
        hbox.setSpacing(200);
        hbox.setPadding(new Insets(100, 100, 100, 100));

        BorderPane root = new BorderPane();
        root.setTop(vbox);
        root.setCenter(cashBox);
        root.setBottom(hbox);


        //Scene Setup



        //Actions
        hitButton.setOnAction(e -> {

        });
        standButton.setOnAction(e -> {
            System.out.println("STAND");
        });
    }
}
*/





















/*
package PokerParadise.BlackJack;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GUI extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        //Creating boxes and buttons etc
        Label guidingMessage = new Label("Welcome to Poker Paradise");
        Label feedbackLabel = new Label("DUMMY TEXT");
        feedbackLabel.setPrefSize(100, 100);
        VBox vbox = new VBox(10, guidingMessage, feedbackLabel);
        vbox.setAlignment(Pos.TOP_CENTER);

        TextField importField = new TextField();
        Label cashLabel = new Label("You have: ");
        importField.setPrefWidth(50);
        Pane cashBox = new Pane(cashLabel, importField);
        cashBox.setLayoutX(0);
        cashBox.setLayoutY(100);


        Button hitButton = new Button("HIT");
        Button standButton = new Button("STAND");
        hitButton.setPrefSize(200, 70);
        standButton.setPrefSize(200, 70);
        HBox hbox = new HBox(10, hitButton, standButton);
        hbox.setAlignment(Pos.BOTTOM_CENTER);
        hbox.setSpacing(200);
        hbox.setPadding(new Insets(100, 100, 100, 100));

        BorderPane root = new BorderPane();
        root.setTop(vbox);
        root.setCenter(cashBox);
        root.setBottom(hbox);


        //Scene Setup
        var scene = new Scene(root, 1280, 720);
        stage.setMinHeight(720);
        stage.setMinWidth(1280);
        stage.setTitle("Poker Paradise");
        stage.setScene(scene);
        stage.show();


        //Actions
        hitButton.setOnAction(e -> {
            System.out.println("HIT");
        });
        standButton.setOnAction(e -> {
            System.out.println("STAND");
        });

    }
}

 */