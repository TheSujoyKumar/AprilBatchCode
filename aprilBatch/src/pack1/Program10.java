package pack1;

import pack2.AccessModifiersEx;

public class Program10 {

	int sum(int x, int y){
		
		return x+y;
	}
	
float sum(float x, float y){
		
		return x+y;
	} 
double sum(int x, float y){
	
	return x+y;
} 
double sum(float x, int y){
	
	return x+y;
} 
	public static void main(String[] args) {
		
		Program10 obj = new Program10();
		
		int result = obj.sum(25, 45);
		obj.sum(25.25f, 35);
		
		System.out.println(result);
		
		AccessModifiersEx obj2 = new AccessModifiersEx();
		//System.out.println(obj2.x);
	}

}
