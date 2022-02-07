package taranpreet_kaur_ex1;

/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package ca.sheridancollege.week3.softwarefundamentals.ice1;

import content.Card;
import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Taranpreet Kaur
 * @date 29th JAN 2020
 * @Student_num
 * @modified by Taranpreet Kaur
 * 
 */
public class CardTrick {
	
	static Random rn = new Random();
//	static String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};

	
	public static Card pickCard() {
		int value = rn.nextInt(13 - 1 + 1) + 1;
    	int suitNumber = rn.nextInt(3 - 0 + 1) + 0;
    	Card c =  new Card();
    	c.setSuit(Card.SUITS[suitNumber]);
    	c.setValue(value);
    	return c;
		
	}
    
    public static void main(String[] args)
    {
    	int value;
    	int suitNumber;
        Card[] magicHand = new Card[7];
    	

        for (int i=0; i<magicHand.length; i++)
        {
        	value = rn.nextInt(13 - 1 + 1) + 1;
        	suitNumber = rn.nextInt(3 - 0 + 1) + 0;
            Card c = new Card();
            c.setSuit(Card.SUITS[suitNumber]);
            c.setValue(value);
            magicHand[i] = c;
        }
        
        Card pickedCard = pickCard();
//        System.out.println(pickedCard.getValue());
//        System.out.println(pickedCard.getSuit());
        
       
        int flag= 0;
        for (int i=0; i<magicHand.length; i++)
        {
//        	 System.out.println(magicHand[i].getValue());
//             System.out.println(magicHand[i].getSuit());
        	if(magicHand[i].getSuit() == pickedCard.getSuit() && magicHand[i].getValue() == pickedCard.getValue()) {
        		printInfo();
        		break;
        	}
        }
        
    }

	private static void printInfo() {
		// TODO Auto-generated method stub
		
	}
        
        
    
}
