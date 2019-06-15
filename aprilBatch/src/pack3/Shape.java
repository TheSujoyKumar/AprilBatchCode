package pack3;

abstract public class Shape {

	int x;
	Shape(){
		System.out.println("Shape constructor");
	}
	abstract void draw();
	
	public void show() {
		System.out.println("Shape - show method executed");
	}
}
