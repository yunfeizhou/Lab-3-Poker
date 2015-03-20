package poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
	private ArrayList<Card> cards;

	public Deck() {

		ArrayList<Card> MakingDeck = new ArrayList<Card>();
		for (short i = 0; i <= 3; i++) {
			eSuit SuitValue = eSuit.values()[i];			
			for (short j = 0; j <= 12; j++) {
				eRank RankValue = eRank.values()[j];				
				Card NewCard = new Card(SuitValue,RankValue);
				MakingDeck.add(NewCard);
			}
		}

		cards = MakingDeck;
		
		Collections.shuffle(cards);
		
	}
    
	public Deck(int numberOfJokers) {
		this();
		for (short i = 1; i <= numberOfJokers; i++) {
			cards.add(new Card(eSuit.JOKER,eRank.JOKER));
		}
		Collections.shuffle(cards);
	}
	
	public Deck(int numberOfJokers, ArrayList<Card> WildCards) {
		this();
		for (short i = 1; i <= numberOfJokers; i++) {
			cards.add(new Card(eSuit.JOKER,eRank.JOKER));
		}
	}
		
	public Card drawFromDeck() {
		// Removes the first card from the deck and return the card
		Card FirstCard = cards.get(0);
		cards.remove(0);
		return FirstCard;
	}

	public int getTotalCards() {
		// Returns the total number of cards still in the deck
		return cards.size();
	}
}