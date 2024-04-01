package no.ntnu.idatx2003.oblig3.cardgame.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javafx.scene.control.TextField;


/**
 * Represents a hand of playing cards.
 *
 * @author Sandra Lundvang Ulsmåg
 * @version 2024-03-10
 */
public class HandOfCards {
  public ArrayList<PlayingCard> handOfCards;
  public TextField cardView;

  /**
   * Creates an instance of HandOfCards.
   */
  public HandOfCards() {
    this.handOfCards = new ArrayList<>();
  }

  public ArrayList<PlayingCard> getHandOfCards() {
    return handOfCards;
  }

  /**
   * Display the cards on hand.
   */
  public void displayHandOfCards() {
    String cardsOnHand = "";
    for (PlayingCard card : this.handOfCards) {
      cardsOnHand += card.getAsString() + " ";
    }
    this.cardView.setText(cardsOnHand);
  }

  /**
   * Add all the cards that are dealt to the hand.
   *
   * @param cards The cards to be added.
   */
  public void addCards(ArrayList<PlayingCard> cards) {
    if (cards == null) {
      throw new IllegalArgumentException("cards cannot be null");
    } else {
      for (PlayingCard card : cards) {
        if (!this.handOfCards.contains(card)) {
          this.handOfCards.add(card);
        }
      }
    }
  }

  /**
   * Gives the user the option to remove a card from the hand and empty the hand of cards.
   */
  public void cleanHand() {
    this.handOfCards.clear();
  }

  /**
   * Returns the total number of cards on the player's hand.
   *
   * @return the number of cards on hand
   */
  public int getNumberOfCards() {
    return this.handOfCards.size();
  }

  /**
   * Returns the total sum of all the cards added together on a player's hand value.
   *
   * @return The sum of the values of all cards on hand
   */
  public int getSumOfCardsValue() {
    return this.handOfCards.stream().map(card -> card.getFace()).reduce(0, Integer::sum);
  }

  /**
   * Checks if the hand contains the queen of spades.
   *
   * @return {@code true} if hand contains queen of spades, {@code false} if not.
   */
  public boolean hasQueenOfSpades() {
    return this.handOfCards.stream().anyMatch(card -> card.getAsString().equals("S12"));
  }

  public boolean checkForFlush(int typeOfFlush) {
    if (handOfCards.stream().filter(c -> c.getSuit() == 'S').count() >= typeOfFlush
        || handOfCards.stream().filter(c -> c.getSuit() == 'H').count() >= typeOfFlush
        || handOfCards.stream().filter(c -> c.getSuit() == 'D').count() >= typeOfFlush
        || handOfCards.stream().filter(c -> c.getSuit() == 'C').count() >= typeOfFlush) {
      return true;
    }
    return false;
  }

  public String getFlushMessage(boolean hasFlush) {
    if (hasFlush) {
      return "Du har flush!";
    } else {
      return "Ingen flush denne gangen:(";
    }
  }
}