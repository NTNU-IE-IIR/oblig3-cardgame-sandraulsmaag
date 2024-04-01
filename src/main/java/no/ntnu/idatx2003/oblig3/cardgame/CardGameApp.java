package no.ntnu.idatx2003.oblig3.cardgame;

import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import  no.ntnu.idatx2003.oblig3.cardgame.model.DeckOfCards;
import  no.ntnu.idatx2003.oblig3.cardgame.model.HandOfCards;
import  no.ntnu.idatx2003.oblig3.cardgame.model.PlayingCard;
import javafx.application.Application;
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

    private TextField nameTextField;
    private TextField gradeTextField;
    private VBox studentList;


    @Override
    public void start(Stage primaryStage) {
      BorderPane root = createBP();

      Scene scene = new Scene(root, 400, 300, Color.LIGHTGREEN);
      primaryStage.setTitle("Card Game");
      primaryStage.setScene(scene);
      primaryStage.show();
    }

    private BorderPane createBP() {
      BorderPane rootNode = new BorderPane();

      VBox leftPane = createButtonPane();
      rootNode.setLeft(leftPane);

      VBox rightPane = createRightPane();
      rootNode.setRight(rightPane);

      VBox centerPane = createCenterPane();
        rootNode.setCenter(centerPane);

      return rootNode;
    }
    private VBox createButtonPane() {
      VBox buttonPane = new VBox(10);
      buttonPane.setPadding(new Insets(10));
      buttonPane.setAlignment(Pos.BOTTOM_CENTER);



      Label checkForFlush = new Label();
      Label checkTheTotalSum = new Label();
      Label checkQueenOfSpades = new Label(); // Endret fra 'chechQueenOfHarts'

      // Sett initialverdier for etikettene (kan være tomme eller forhåndsdefinerte verdier)
      checkForFlush.setText("Do you have a flush?" );
      checkTheTotalSum.setText("The total sum of the faces is:" );
      checkQueenOfSpades.setText("Do you have the Queen of spades?: " );

      // Legg til etikettene til buttonPane
      buttonPane.getChildren().addAll(checkForFlush, checkQueenOfSpades,checkTheTotalSum);;


      return buttonPane;
    }

    private VBox createRightPane() {
      VBox rightPane = new VBox(20);
      rightPane.setAlignment(Pos.CENTER);

      Button dealHandButton = new Button("Deal Hand");
      Button newHandButton = new Button("New Hand");

      // Legg til hendelseslyttere for knappene om nødvendig
      // For eksempel:
     // dealHandButton.setOnAction(e -> dealHand());
     // newHandButton.setOnAction(e -> newHand());

      // Legg til knappene i rightPane
      rightPane.getChildren().addAll(dealHandButton, newHandButton);

      rightPane.setPadding(new Insets(10));
      return rightPane;
    }

    private VBox createCenterPane() {
      VBox centerPane = new VBox();
      centerPane.setAlignment(Pos.CENTER);


     // for (PlayingCard card : handOfCards) {
       // Text cardOnHandText = new Text(card.getAsString());
       // centerPane.getChildren().add(cardOnHandText);
      //}

      return centerPane;
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

