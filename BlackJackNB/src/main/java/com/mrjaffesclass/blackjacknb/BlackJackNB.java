/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mrjaffesclass.blackjacknb;

/**
 *
 * @author student
 */
public class BlackJackNB {
    
    //Welcome Message
    public static void main(String[] args) {
        System.out.println("This is the BlackJack Game!");
        
        //Create Playing Deck
        Deck playingDeck = new Deck();
        playingDeck.createFullDeck();
        playingDeck.shuffle();
        
        System.out.println(playingDeck);
    }
}
