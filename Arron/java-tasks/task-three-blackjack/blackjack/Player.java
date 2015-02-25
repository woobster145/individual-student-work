package blackjack;

public class Player{
	
	public String playerOne;
	public static int playerScore;
	public static int cardOneScore;
	public static int cardTwoScore;
	
	public Player (String playerOne, int playerScore, int cardOneSocre, int cardTwoScore){
		Player.playerScore = cardOneScore + cardTwoScore;
		Player.cardOneScore = cardOneScore;
		Player.cardTwoScore = cardTwoScore;
	}

	public String getPlayerOne() {
		return playerOne;
	}
	public void setPlayerOne(String playerName) {
		this.playerOne = playerName;
	}
	public int getPlayerScore() {
		return playerScore;
	}
	public void setPlayerScore(int playerScore) {
		Player.playerScore = playerScore;
	}
	public int getCardOneScore() {
		return cardOneScore;
	}
	public void setCardOneScore(int cardOneScore) {
		Player.cardOneScore = cardOneScore;
	}
	public int getCardTwoScore() {
		return cardTwoScore;
	}
	public void setCardTwoScore(int cardTwoScore) {
		Player.cardTwoScore = cardTwoScore;
	}
}