/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mrjaffesclass.blackjacknb;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author student
 */
public class Deck {
    
    //instance variables
    private ArrayList<Card> cards;
    
    //construct variables
    public Deck() {
        this.cards = new ArrayList<Card>();
        
    }
    
    public void createFullDeck() {
        //generate cards
        for (Suit cardSuit : Suit.values()) {
            for (Value cardValue : Value.values()) {
                // add new card to the deck
                this.cards.add(new Card(cardSuit, cardValue));
            }
        }
    }
    
    public void shuffle() {
        ArrayList<Card> tempDeck = new ArrayList<Card>();
        //Use random
        Random random = new Random();
        int randomCardIndex = 0;
        int originalSize = this.cards.size();
        for(int i = 0; i < originalSize; i++) {
            //Generate random index rand.nextInt((max-min) + 1) + min;
            randomCardIndex = random.nextInt((this.cards.size()- 1 - 0) + 1) + 0;
            tempDeck.add(this.cards.get(randomCardIndex));
            //Remove from original deck
            this.cards.remove(randomCardIndex); 
        }
        this.cards = tempDeck;
    }
    
    public String toString() {
        String cardListOutput ="";
        for (Card aCard : this.cards) {
            cardListOutput += "/n" + aCard.toString(); 
        }
        return cardListOutput;
    }
    
    public void removeCard(int i){
        this.cards.remove(i);
}
    
    public Card getCard (int i) {
        return this.cards.get(i);
    }
    
    public void addCard (Card addCard) {
        this.cards.add(addCard);
    }
    
    //Draws From the Deck
    public void Draw (Deck comingFrom) {
        this.cards.add(comingFrom.getCard(0));
        comingFrom.removeCard(0);
    }
}
