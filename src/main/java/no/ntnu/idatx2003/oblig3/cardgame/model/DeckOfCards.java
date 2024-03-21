package no.ntnu.idatx2003.oblig3.cardgame.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/**
 * This class represents a deck of cards.
 * It contains 52 cards in one deck and ranges from 2 to Ace in four suits.
 *
 * @author Sandra Lundvang Ulsmåg
 * @version 2024-03-10
 */

public class DeckOfCards {

    private final char[] suits = {'S', 'H', 'D', 'C'};
    private ArrayList<PlayingCard> cardDeck;
    private Random random;



    /**
   * Creates an instance of a deck of cards.
   */
    public DeckOfCards(){
      this.cardDeck = new ArrayList<>();
      this.random = new Random();
    }




  /**
   * Initializes the deck of cards with 52 cards.
   * The deck contains 13 cards of each suit.
   */
  public void fillCardDeck(){
    for(int suit = 0; suit<suits.length; suit++){
      for(int face=1; face<=13 ; face++ ){
        cardDeck.add(new PlayingCard(suits[suit],face));
      }
    }
    assert cardDeck.size() == 52 : "CardDeck does not containt 52 cards";  //ASSERTION
  }





  /**
   * Deals a hand of given number of random cards from the deck.
   *
   * @param numberOfCards the number of cards to deal
   * @return collection that represents a hand of playing cards
   */
  public List<PlayingCard> dealHand(int numberOfCards){
    ArrayList<PlayingCard> dealtCards = new ArrayList<>();
    for(int i=0; i<numberOfCards; i++){
      PlayingCard card = this.cardDeck.remove(this.random.nextInt(this.cardDeck.size()));
      dealtCards.add(card);
    }
    return dealtCards;
  }




  /**
   * Resets the deck of card by removing all cards and then fill the deck again.
   */
  public void reset() {
    this.cardDeck.clear();
    fillCardDeck();
  }



 }



