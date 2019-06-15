package pack2;

public class B extends A{

	B(){
		System.out.println("B class constructor");
	}
	B(String name){
		System.out.println("B class parametrized constructor -"+name);
	}
	public static void m2() {
		
	}
	public void show() {
		couner++;
		System.out.println("B class method "+couner);
	
	}
}
