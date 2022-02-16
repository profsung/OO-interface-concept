package concept;
public class Main {

	public static void main(String[] args) {
		DoSomething d = new DoSomething();
		int inc = d.increase(10);
		int dec = d.decrease(10);
		int raise = Operation.raiseDouble(20);
		System.out.println("increase: " + inc);
		System.out.println("decrease: " + dec);
		System.out.println("raiseDouble: " + raise);
	}

}

class DoSomething implements Operation {

	@Override
	public int increase(int n) {
		return n + 3;
	}

}