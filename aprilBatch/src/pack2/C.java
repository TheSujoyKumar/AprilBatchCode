package pack2;

public class C extends B{

	 final double pi = 3.14;
	C(){
		super("Sujoy");
		System.out.println("C class constructor");
		
	}
	void display() {
		
		System.out.println("C class method");
	}
	public static void main(String[] args) {
		
		C obj = new C();
		
		int i=100;
		long k = i;//implicit type casting
		
		double d =100.07;
		long p = (long)d; //Explicit type casting
		
		
	}

}
