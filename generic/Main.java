package generic;

public class Main {

	public static void main(String[] args) {

		Car c1 = new Car(4);
		Car c2 = new Car(6);
		System.out.println("c1 get clearance: " + isSafeToPass(c1, 5));
		System.out.println("c2 get clearance: " + isSafeToPass(c2, 5));

		Box b1 = new Box(10, 4, 100);
		Box b2 = new Box(5, 5, 5);
		System.out.println("b1 get clearance: " + isSafeToPass(b1, 5));
		System.out.println("b2 get clearance: " + isSafeToPass(b2, 5));

		Cone n1 = new Cone(100, 7, 4);
		Cone n2 = new Cone(10, 7, 6);
		System.out.println("cone1 get clearance: " + isSafeToPass(n1, 5));
		System.out.println("cone2 get clearance: " + isSafeToPass(n2, 5));
		
	}

	// generic programming => program independent of types
	public static boolean isSafeToPass(Clearance obj, int limit) {
		if (obj.getClearance() < limit) return true;
		else return false;
		
	}
	
}
