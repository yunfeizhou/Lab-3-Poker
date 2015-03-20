package Hands;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import poker.Card;
import poker.Deck;
import poker.Hand;
import poker.eHandStrength;
import poker.eRank;
import poker.eSuit;

public class TestHands {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void TestNatualRoyalFlush() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.KING));
		rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.JACK));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.ACE));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be rf:",eHandStrength.NatualRoyalFlush.getHandStrength(),h.getHandStrength());	
	}
	
	@Test
	public final void TestRoyalFlush() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.ACE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.KING));
		rfHand.add(new Card(eSuit.CLUBS,eRank.JOKER));
		rfHand.add(new Card(eSuit.CLUBS,eRank.JACK));
		rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		Hand h = Hand.EvalHand(rfHand);				
		
		assertEquals("Should be rf:",eHandStrength.RoyalFlush.getHandStrength(),h.getHandStrength());
		
		
	}
	
	@Test
	public final void TestStraightFlush() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.TEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.KING));
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		rfHand.add(new Card(eSuit.CLUBS,eRank.JACK));
		rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		Hand h = Hand.EvalHand(rfHand);				
		
		assertEquals("Should be sf:",eHandStrength.StraightFlush.getHandStrength(),h.getHandStrength());		
		
	}	

	@Test
	public final void TestFourOfAKind() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.SPADES,eRank.KING));
		rfHand.add(new Card(eSuit.HEARTS,eRank.KING));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.JOKER));
		rfHand.add(new Card(eSuit.CLUBS,eRank.NINE));
		rfHand.add(new Card(eSuit.JOKER,eRank.KING));
		Hand h = Hand.EvalHand(rfHand);				
		
		assertEquals("Should be rf:",eHandStrength.FourOfAKind.getHandStrength(),h.getHandStrength());
		
		
	}	

	@Test
	public final void TestThreeOfAKind() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.SPADES,eRank.QUEEN));
		rfHand.add(new Card(eSuit.HEARTS,eRank.QUEEN));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.QUEEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.NINE));
		rfHand.add(new Card(eSuit.HEARTS,eRank.THREE));
		Hand h = Hand.EvalHand(rfHand);				
		
		assertEquals("Should be rf:",eHandStrength.ThreeOfAKind.getHandStrength(),h.getHandStrength());
		
	}
	
public final void TestOneJokerThreeOfAKind() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.SPADES,eRank.QUEEN));
		rfHand.add(new Card(eSuit.HEARTS,eRank.QUEEN));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.ACE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.NINE));
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		Hand h = Hand.EvalHand(rfHand);				
		
		assertEquals("Should be rf:",eHandStrength.ThreeOfAKind.getHandStrength(),h.getHandStrength());
		
	}
	
	@Test
	public final void TestTwoJokersThreeOfAKind() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.SPADES,eRank.QUEEN));
		rfHand.add(new Card(eSuit.HEARTS,eRank.KING));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.ACE));
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		Hand h = Hand.EvalHand(rfHand);				
		
		assertEquals("Should be rf:",eHandStrength.ThreeOfAKind.getHandStrength(),h.getHandStrength());		
		
	}	
	
	@Test
	public final void TestFullHouse() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.SPADES,eRank.QUEEN));
		rfHand.add(new Card(eSuit.HEARTS,eRank.KING));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.ACE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.ACE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		Hand h = Hand.EvalHand(rfHand);				
		
		assertEquals("Should be rf:",eHandStrength.FullHouse.getHandStrength(),h.getHandStrength());		
		
	}
	
public final void TestOneJokerFullHouse() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.SPADES,eRank.KING));
		rfHand.add(new Card(eSuit.HEARTS,eRank.KING));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.ACE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.ACE));
		rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		Hand h = Hand.EvalHand(rfHand);	
		
		assertEquals("Should be rf:",eHandStrength.FullHouse.getHandStrength(),h.getHandStrength());		
		
	}

public final void TestPair() {
	
	ArrayList<Card> rfHand = new ArrayList<Card>();
	rfHand.add(new Card(eSuit.SPADES,eRank.KING));
	rfHand.add(new Card(eSuit.HEARTS,eRank.KING));
	rfHand.add(new Card(eSuit.DIAMONDS,eRank.ACE));
	rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
	rfHand.add(new Card(eSuit.CLUBS,eRank.JACK));
	Hand h = Hand.EvalHand(rfHand);	
	
	assertEquals("Should be rf:",eHandStrength.Pair.getHandStrength(),h.getHandStrength());		
	
	}

public final void TestOneJokerPair() {
	
	ArrayList<Card> rfHand = new ArrayList<Card>();
	rfHand.add(new Card(eSuit.SPADES,eRank.ACE));
	rfHand.add(new Card(eSuit.HEARTS,eRank.KING));
	rfHand.add(new Card(eSuit.DIAMONDS,eRank.QUEEN));
	rfHand.add(new Card(eSuit.CLUBS,eRank.JACK));
	rfHand.add(new Card(eSuit.JOKER,eRank.JOKER));
	Hand h = Hand.EvalHand(rfHand);	
	
	assertEquals("Should be rf:",eHandStrength.Pair.getHandStrength(),h.getHandStrength());		
	
	}

public final void TestTwoPair() {
	
	ArrayList<Card> rfHand = new ArrayList<Card>();
	rfHand.add(new Card(eSuit.SPADES,eRank.KING));
	rfHand.add(new Card(eSuit.HEARTS,eRank.KING));
	rfHand.add(new Card(eSuit.DIAMONDS,eRank.ACE));
	rfHand.add(new Card(eSuit.CLUBS,eRank.ACE));
	rfHand.add(new Card(eSuit.CLUBS,eRank.JACK));
	Hand h = Hand.EvalHand(rfHand);	
	
	assertEquals("Should be rf:",eHandStrength.TwoPair.getHandStrength(),h.getHandStrength());		
	
	}


}


