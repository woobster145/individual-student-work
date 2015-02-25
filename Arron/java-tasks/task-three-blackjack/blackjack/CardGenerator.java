package blackjack;

import java.util.Random;
import java.util.Scanner;

public class CardGenerator extends Player {
	  
	  public CardGenerator(String playerName, int playerScore, int cardOneSocre,
			int cardTwoScore) {
		super(playerName, playerScore, cardOneSocre, cardTwoScore);
	}

	public static final void main(String... aArgs){
		  
		  System.out.println("Generating Cards");
	    
		  Random cardScore = new Random();
		  for (int cards = 1; cards <= 2; ++cards){
	      int randomInt = cardScore.nextInt (10);
	      System.out.println("Card : " + randomInt);
	      playerScore += randomInt;
	    }
		  System.out.println("Total : " + Player.playerScore);

	if(playerScore > 21){
		System.out.println("BUST!");
	}
	else if(playerScore == 21){
		System.out.println("BLACKJACK!");
	}
	while(Player.playerScore < 21){
	if(Player.playerScore < 21){
		System.out.println("Hit or Stick?");
	Scanner s = new Scanner(System.in);
	String reply = s.nextLine();
	if(reply.equals("Hit") || reply.equals("hit")){
		 Random newCardScore = new Random();
		 	int randomInt = newCardScore.nextInt (10);
		 	System.out.println("Card : " + randomInt);
		 	playerScore += randomInt;
		 	System.out.println("New Total : " + Player.playerScore);
	}
 	else if(reply.equals("Stick") || reply.equals("stick")){
 		System.out.println("End Total : " + Player.playerScore);
 		System.out.println("Game Over");
 	if (reply.equals("Stick") || reply.equals("stick")) break;
 		}
	}
			if(playerScore > 21){
				System.out.println("BUST!");
			if(playerScore == 21){
				System.out.println("BLACKJACK!");
			
				}
			}
		}
	}
}