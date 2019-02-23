package Activity1;
import Activity1.Card;
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card aceHearts = new Card("Ace", "Hearts", 14);
		System.out.println(aceHearts.rank());
		System.out.println(aceHearts.suit());
		System.out.println(aceHearts.pointValue());
		System.out.println(aceHearts.toString());
		Card tenDiamonds = new Card("Ten", "Diamonds", 10);
		System.out.println(tenDiamonds.rank());
		System.out.println(tenDiamonds.suit());
		System.out.println(tenDiamonds.pointValue());
		System.out.println(tenDiamonds.toString());
		Card fiveSpades = new Card("Five", "Spades", 5);
		System.out.println(fiveSpades.rank());
		System.out.println(fiveSpades.suit());
		System.out.println(fiveSpades.pointValue());
		System.out.println(fiveSpades.toString());
		System.out.println(aceHearts.matches(tenDiamonds));
		System.out.println(aceHearts.matches(fiveSpades));
		System.out.println(aceHearts.matches(aceHearts));
		System.out.println(tenDiamonds.matches(fiveSpades));
		System.out.println(tenDiamonds.matches(aceHearts));
		System.out.println(tenDiamonds.matches(tenDiamonds));
		System.out.println(fiveSpades.matches(aceHearts));
		System.out.println(fiveSpades.matches(tenDiamonds));
		System.out.println(fiveSpades.matches(fiveSpades));
	}
}
