package generic;

public class Box implements Clearance {

	private int height;
	private int width;
	private int length;

	public Box(int height, int width, int length) {
		this.height = height;
		this.width = width;
		this.length = length;
	}

	@Override
	public double getClearance() {
		return Math.min(height, Math.min(width, length));
	}

}
