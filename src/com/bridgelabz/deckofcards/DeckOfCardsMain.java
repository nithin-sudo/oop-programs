package com.bridgelabz.deckofcards;

public class DeckOfCardsMain {
    /**
     * calling the methods by using the object.
     * @param args
     */
    public static void main(String[] args)
    {
        DeckOfCards cards = new DeckOfCards();
        cards.initializeDeck();
        cards.shuffleCards();
        cards.displayCards();
    }
}
