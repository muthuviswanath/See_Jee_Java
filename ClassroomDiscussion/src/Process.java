
public class Process {
	public static void main(String[] args) {
		Card c = new Card();
		int pin = 1234;
		int amount = 20000;
		ATMMachine atm = new ATMMachine();
		Money mon = atm.dispense(c, pin, amount);
		System.out.println(mon);
	}
}
