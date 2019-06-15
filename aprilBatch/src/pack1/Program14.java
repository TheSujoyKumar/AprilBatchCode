package pack1;

public class Program14 {

	
	int x;
	String name;
	
	
	Program14() {
		x = 12;
		name = "Sujoy";
	}
	Program14(int a, String b){
		x = a;
		name = b;
	}
	 
	public static void main(String[] args) {
		
		Program14 obj = new Program14();
		
		System.out.println(obj.x);
		System.out.println(obj.name);
		Program14 obj2 = new Program14(23, "Sameer");
		System.out.println(obj2.x);
		System.out.println(obj2.name);
	}

}
