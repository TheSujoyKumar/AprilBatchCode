package pack2;

public class StaticVariableEx {

	static int counter=0;
	int r=9;
	
	public StaticVariableEx() {
		counter++;
		System.out.println(counter);
	}
	static void sum() {
		 int v=98;
		
	}
	public static void main(String[] args) {
		
		System.out.println(StaticVariableEx.counter);
		StaticVariableEx.sum();
		sum();
		StaticVariableEx obj1 = new StaticVariableEx();
		obj1.sum();
		StaticVariableEx obj2 = new StaticVariableEx();
		StaticVariableEx obj3 = new StaticVariableEx();
		
	}

}
