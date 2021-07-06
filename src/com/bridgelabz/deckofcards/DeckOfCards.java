package com.bridgelabz.deckofcards;

public class DeckOfCards {
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen", "King", "Ace"};

        String[] firstPerson = new String[9];
        String[] secondPerson = new String[9];
        String[] thirdPerson = new String[9];
        String[] fourthPerson = new String[9];

        String[] deck;
        int totalCards;

        /**
         * initialize deck of cards.
         */
        public void initializeDeck()
        {
            totalCards = suits.length * ranks.length;
            deck = new String[totalCards];
            for (int i = 0; i < ranks.length; i++)
            {
                for (int j = 0; j < suits.length; j++)
                {
                    deck[suits.length*i + j] = suits[j] + " " + ranks[i];
                }
            }
        }

        /**
         * Shuffling the cards using random function.
         */
        public void shuffleCards()
        {
            for (int i = 0; i < totalCards; i++)
            {
                int r = i + (int) (Math.random() * (totalCards-i));
                String temp = deck[r];
                deck[r] = deck[i];
                deck[i] = temp;
            }
        }

        /**
         * printing the cards of the each player.
         */
        public void displayCards()
        {
            int one = 0, two = 0, three = 0,four = 0;
            for (int i = 0; i < 36; i++)
            {

                if(i % 4 == 0)
                {
                    firstPerson[one] = deck[i];
                    one++;
                }
                else if(i % 4 == 1)
                {
                    secondPerson[two] = deck[i];
                    two++;
                }
                else if(i % 4 == 2)
                {
                    thirdPerson[three] = deck[i];
                    three++;
                }
                else if(i % 4 == 3)
                {
                    fourthPerson[four] = deck[i];
                    four++;
                }
            }
            System.out.println("First person cards are: ");
            for (String iterator : firstPerson)
            {
                System.out.println(iterator);
            }
            System.out.println();

            System.out.println("Second person cards are: ");
            for (String iterator : secondPerson)
            {
                System.out.println(iterator);
            }
            System.out.println();

            System.out.println("Third person cards are: ");
            for (String iterator : thirdPerson)
            {
                System.out.println(iterator);
            }
            System.out.println();

            System.out.println("Fourth person cards are: ");
            for (String iterator : fourthPerson)
            {
                System.out.println(iterator);
            }
        }
}
