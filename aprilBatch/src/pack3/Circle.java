package pack3;

public class Circle extends Shape{

	public static void main(String[] args) {
		Circle obj = new Circle();
		obj.draw();

	}

	@Override
	void draw() {
	System.out.println("Circle-drow method executed");
		
	}

}
