public class Player {

	private int piece, position = 0, goCounter = 0, doublesCounter = 0, balance;
	
	public Player(int playerPiece) {
		piece = playerPiece;
	}
	
	public void mortgage(PropertySpace ps) {
		
	}
	
	public void unMortgage(PropertySpace ps) {
		
	}
	
	public void takeTurn() {
		movePlayer(rollDice());
	}
	
	public int rollDice() {
		Die die1 = new Die();
		Die die2 = new Die();
		
		die1.rollDie();
		die2.rollDie();
		
		if(die1.getValue()==die2.getValue()) {
			doublesCounter++;
		}else{ doublesCounter = 0;}
		return(die1.getValue()+die2.getValue());
	}
	
	//Is goCounter necessary if we can just divide position by 40?
	public void movePlayer(int move) {
		position += move;
		if(position >= 40) {
			position -= 40;
			//Add money for passing Go Here, and reset position to int below 40.
			balance += 200;
		}
	}
	
	public void upgrade(PropertySpace ps) {
		
	}
	
	public void purchase(PropertySpace ps) {
		
	}
}
