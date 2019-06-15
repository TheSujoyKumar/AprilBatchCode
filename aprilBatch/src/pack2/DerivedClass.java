package pack2;

public class DerivedClass extends BaseClass{

	int count=98;
	
	void display() {
		System.out.println(super.count);
		System.out.println("Derived class method "+count);
		show();
		super.show();
	}
	public void show() {
		System.out.println("Derived class show method");
	}

	public static void main(String[] args) {
		
		DerivedClass obj = new DerivedClass();
		obj.display();
		

	}

}
