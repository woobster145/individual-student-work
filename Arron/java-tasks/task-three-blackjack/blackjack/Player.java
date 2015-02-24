package blackjack;

public class Player{
	
	public String playerName;
	public int playerScore;
	public int cardOneScore;
	public int cardTwoScore;
	
	public Player (String playerName, int playerScore, int cardOneSocre, int cardTwoScore, int cardOneScore){
		this.playerScore = cardOneScore + cardTwoScore;
		this.cardOneScore = cardOneScore;
		this.cardTwoScore = cardTwoScore;
	}

	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getPlayerScore() {
		return playerScore;
	}
	public void setPlayerScore(int playerScore) {
		this.playerScore = playerScore;
	}
	public int getCardOneScore() {
		return cardOneScore;
	}
	public void setCardOneScore(int cardOneScore) {
		this.cardOneScore = cardOneScore;
	}
	public int getCardTwoScore() {
		return cardTwoScore;
	}
	public void setCardTwoScore(int cardTwoScore) {
		this.cardTwoScore = cardTwoScore;
	}
}