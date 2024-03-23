package no.ntnu.idatx2003.oblig3.cardgame.ui;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import  no.ntnu.idatx2003.oblig3.cardgame.model.DeckOfCards;
import  no.ntnu.idatx2003.oblig3.cardgame.model.HandOfCards;
import  no.ntnu.idatx2003.oblig3.cardgame.model.PlayingCard;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;

import javafx.scene.control.TableView;
import javafx.scene.control.Label;
import javafx.geometry.Pos;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.layout.VBox;
import java.util.ArrayList;



  public class CardGameApp extends Application {

    private DeckOfCards deck;
    private HandOfCards handOfCards;
    private ArrayList<PlayingCard> handOfCardsList;
    private String text = "";

    private TextField cardView;



    /**
     * Constructs the main window.
     *
     * @param stage the stage to populate with the scene graph
     */
    @Override
    public void start(Stage stage) {

      DeckOfCards deck = new DeckOfCards();
      HandOfCards handOfCards = new HandOfCards();
      DealHand dealHand = new DealHand();

      // Set the title of the window
      stage.setTitle("Card Game Application");

      // Opprett en instans av HandOfCards
      handOfCards = new HandOfCards();

      // Sentralt layout

      VBox centerBox = new VBox();
      centerBox.setAlignment(Pos.CENTER);
      centerBox.setSpacing(10);

      Label handLabel = new Label("Hand of Cards:");

      centerBox.getChildren().add(handLabel);













      //Vestre siden
      Button button1 = new Button("Ny utdeling");
      Button button2 = new Button("Trekk kort");
      HandOfCards finalHandOfCards1 = handOfCards;
      button1.setOnAction(event -> finalHandOfCards1.cleanHand());
      HandOfCards finalHandOfCards = handOfCards;
      button2.setOnAction(event -> {
        handLabel.setText("Hand of Cards: " + finalHandOfCards.getHandOfCards());
      });


      VBox buttonBox = new VBox(10);
      buttonBox.getChildren().addAll(button1, button2);
      buttonBox.setAlignment(Pos.CENTER);

      BorderPane layout = new BorderPane();
      layout.setRight(buttonBox);
      layout.setCenter(centerBox);



      // Opprett en Scene
      Scene scene = new Scene(layout, 400, 300);

      // Set the scene to the stage
      stage.setScene(scene);
      stage.show();
    }




    /**
     * The main method of the application. Witch starts the application.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
  }

