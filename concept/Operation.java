package concept;

import java.util.Random;

public interface Operation {

	int N_OPERATIONS = 4; // public static const

	int increase(int n); // public abstract

	default int decrease(int n) {
		n = n - getAmount(n);
		return n;
	}

	// static method
	static int raiseDouble(int n) {
		return n * 2;
	}

	// private method
	private int getAmount(int n) {
		Random r = new Random();
		return r.nextInt(n);
	}
	
}
