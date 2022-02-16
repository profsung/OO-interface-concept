package generic;

public class Main {

	public static void main(String[] args) {

		Car c1 = new Car(4);
		Car c2 = new Car(6);
		System.out.println("c1 get clearance: " + isPassible(c1));
		System.out.println("c2 get clearance: " + isPassible(c2));

		Box b1 = new Box(10, 4, 100);
		Box b2 = new Box(5, 5, 5);
		System.out.println("b1 get clearance: " + isPassible(b1));
		System.out.println("b2 get clearance: " + isPassible(b2));

		Cone n1 = new Cone(100, 7, 4);
		Cone n2 = new Cone(10, 7, 6);
		System.out.println("cone1 get clearance: " + isPassible(n1));
		System.out.println("cone2 get clearance: " + isPassible(n2));
		
	}

	public static boolean isPassible(Clearance obj) {
		if (obj.getClearance() < 5) {
			return true;
		} else {
			return false;
		}
	}
	
}
