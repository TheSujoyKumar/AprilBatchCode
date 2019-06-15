package pack3;

public class Axis implements RBI,Bank{

	@Override
	public void roi() {
		System.out.println("ROI for Axis 7%");
		
	}

	@Override
	public void saving() {
		RBI.super.newRule(); // default method call
		RBI.rule3(); // static method call
		
		
	}
public static void main(String[] args) {
	Axis obj = new Axis();
	obj.newRule();
}
}
