package generic;

public class Cone implements Clearance {

	private int height;
	private int topDiameter;
	private int bottomDiameter;

	public Cone(int height, int bottomDiameter, int topDiameter) {
		this.height = height;
		this.bottomDiameter = bottomDiameter;
		this.topDiameter = topDiameter;
	}

	@Override
	public double getClearance() {
		return topDiameter > bottomDiameter ? topDiameter : bottomDiameter;
	}
	
}
