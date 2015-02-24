package blackjack;

import java.util.Random;

public class CardGenerator extends Player {
	  
	  public CardGenerator(String playerName, int playerScore, int cardOneSocre,
			int cardTwoScore, int cardOneScore) {
		super(playerName, playerScore, cardOneSocre, cardTwoScore, cardOneScore);
	}

	public static final void main(String... aArgs){
		  
		  System.out.println("Generating Cards");
	    
	    Random cardScore = new Random();
	    for (int idx = 1; idx <= 2; ++idx){
	      int randomInt = cardScore.nextInt(10);
	      System.out.println("Card : " + randomInt);
	    }
	    
	    System.out.println("Total : ");
	  }
}

