package pack1;

public class AreaCalculate {

	
	AreaCalculate(){
		
	}
	
	
	int area(int l, int b) {
		return l*b;
		
	}
	double area (double s) {
		return s*s;
		
	}
	public static void main(String[] args) {
		
		AreaCalculate obj = new AreaCalculate();
		//Calling area method
		System.out.println(obj.area(25d));
	}

	void main() {
		
	}
}
