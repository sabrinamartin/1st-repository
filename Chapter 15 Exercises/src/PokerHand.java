
public class PokerHand extends Deck {
	
	public PokerHand() {
		super(5);
	}
	
	public boolean hasFlush() {
		for (int i = 0; i < 5; i++) {
			if (this.cards[i].suit != this.cards[0].suit) {
				return false;
			}
			
		}
		return true;
	}
	
//	public boolean hasThreeKind() {
//		int[] ranks = {};
//		for (int i = 0; i < 5; i++) {
//			if (ranks.)
//		}
//	}

}
