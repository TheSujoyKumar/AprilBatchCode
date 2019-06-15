package pack1;

public class ArrayEx {

	public static void main(String[] args) {
		
		int ids[] = {14,25,68,98,74};
		
		
		for (int i = 0; i < ids.length; i++) {
			System.out.println(ids[i]);
		}
		 
		
		for(int temp : ids) {
			System.out.println(temp);
		}

	}

}
