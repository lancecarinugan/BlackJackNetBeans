/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mrjaffesclass.blackjacknb;
import java.util.ArrayList;

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
    
    public String toString() {
        String cardListOutput ="";
        int i = 0;
        for (Card aCard : this.cards) {
            cardListOutput += "/n" + i + "-" + aCard.toString();
            i++;
        }
        return cardListOutput;
    }
    
}
