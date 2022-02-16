package generic;

public class Car implements Clearance {

	private int height;

	public Car(int height) {
		this.height = height;
	}

	@Override
	public double getClearance() {
		return height;
	}
	
}
