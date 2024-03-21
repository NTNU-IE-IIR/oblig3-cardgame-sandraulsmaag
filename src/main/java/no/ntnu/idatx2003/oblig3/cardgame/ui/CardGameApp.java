package no.ntnu.idatx2003.oblig3.cardgame.ui;
import javafx.application.Application;
import no.ntnu.idatx2003.oblig3.cardgame.model.DeckOfCards;
import no.ntnu.idatx2003.oblig3.cardgame.model.HandOfCards;
import no.ntnu.idatx2003.oblig3.cardgame.model.PlayingCard;

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





    /**
     * Constructs the main window.
     *
     * @param stage the stage to populate with the scene graph
     */
    @Override
    public void start(Stage stage) {

      // Set the title of the window
    stage.setTitle("Card Game Application");


    // Create a new deck of cards
      // Opprett to knapper
      Button button1 = new Button("Ny utdeling");
      Button button2 = new Button("Trekk kort");

      button1.setOnAction(event -> deck.reset());


      // Opprett en VBox for knappene
      VBox buttonBox = new VBox(10); // 10 er gapet mellom knappene
      buttonBox.getChildren().addAll(button1, button2);
      buttonBox.setAlignment(Pos.CENTER); // Sentrer knappene vertikalt

      // Opprett en BorderPane som hovedlayout
      BorderPane layout = new BorderPane();

      // Plasser VBoxen med knappene til høyre i BorderPane
      layout.setRight(buttonBox);

        // Opprett en Scene
      Scene scene = new Scene(layout, 400, 300);





      //Viser kortene
      // Oppdater handLabel når handOfCards endres
      Label handLabel = new Label("Hand of Cards:" + handOfCardsList);


      // Opprett en VBox for å plassere handLabel og andre GUI-elementer vertikalt
      VBox lefttBox = new VBox();
      lefttBox.setSpacing(10);
      lefttBox.setPadding(new Insets(10));
      lefttBox.getChildren().add(handLabel);

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

