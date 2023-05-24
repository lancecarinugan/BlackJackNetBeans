/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mrjaffesclass.blackjacknb;

/**
 *
 * @author student
 */
public class Card {
    
    private Suit suit;
    private Value value;
    
    public Card (Suit suit, Value value) {
        
        this.suit = suit;
        this.value = value;
    }
    
    public String toString() {
        return this.suit.toString() + "-" + this.value.toString();
    }
    
    public Value getValue() {
        return this.value;
    }
}
