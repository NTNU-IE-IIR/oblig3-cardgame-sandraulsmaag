package no.ntnu.idatx2003.oblig3.cardgame.ui;
import javafx.geometry.Pos;
import javafx.scene.layout.BorderPane;
import no.ntnu.idatx2003.oblig3.cardgame.model.DeckOfCards;
import no.ntnu.idatx2003.oblig3.cardgame.model.HandOfCards;
import no.ntnu.idatx2003.oblig3.cardgame.model.PlayingCard;
import javafx.scene.control.Button;
import java.util.List;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.control.TableView;

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

