package no.ntnu.idatx2003.oblig3.cardgame.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javafx.scene.control.TextField;


/**
   * Represents a hand of playingcards.
   *
   * @author Sandra Lundvang Ulsmåg
   * @version 2024-03-10
   */
  public class HandOfCards {
    public ArrayList<PlayingCard> handOfCards;

    private TextField cardView;


  public  ArrayList<PlayingCard> getHandOfCards() {
    return handOfCards;
  }

    /**
     * Creates an instance of HandOfCards
     */
    public HandOfCards(){
      this.handOfCards = new ArrayList<>();
    }





    /**
     * Add all the cards dealt to the hand.
     * @param cards
     */
    public void addCards(ArrayList<PlayingCard> cards){
      if(cards == null){
        throw new IllegalArgumentException("cards cannot be null");
      }else{
        this.handOfCards.addAll(cards);
      }
    }




    /**
     *Gives the user the option to remove a card from the hand and empies the hand of cards.
     */
    public void cleanHand(){
      this.handOfCards.clear();
    }





    /**
     * Returns the total number of cards on the players hand.
     *
     * @return the number of cards on hand
     */
    public int getNumberOfCards(){
      return this.handOfCards.size();
    }




    /**
     * Returns the total sum of all the cards added together on a players hands value
     *
     * @return The sum of the values of all cards on hand
     */
    public int getSumOfCardsValue(){
      return this.handOfCards.stream()
          .map(card -> card.getFace())
          .reduce(0, (sum, face) -> sum + face);
    }



    /**
     * Checks if . Returns {@code true} if it is, {@code false} if not.
     *
     * @return {@code true} if hand contains queen of spades, {@code false} if not.
     */
    public boolean hasQueenOfSpades(){
      return this.handOfCards.stream()
          .anyMatch(card -> card.getAsString().equals("S12"));
    }


    public boolean checkForFlush(int typeOfFlush){
      if(handOfCards.stream().filter(c -> c.getSuit()=='S').count() >= typeOfFlush||
          handOfCards.stream().filter(c -> c.getSuit()=='H').count() >= typeOfFlush||
          handOfCards.stream().filter(c -> c.getSuit()=='D').count() >= typeOfFlush||
          handOfCards.stream().filter(c -> c.getSuit()=='C').count() >= typeOfFlush){
        return true;
      }
      return false;
    }






}
