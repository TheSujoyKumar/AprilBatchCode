package pack1;

public class BreakEx2 {

	public static void main(String[] args) {
		
		for (int x = 1; x < 10; x++) {
			System.out.println("Outer for loop : "+x);
			
			for(int y=1;y<10;y++) {
				System.out.println("Inner for loop : "+y);
				if (y==5)
					break;
			}
			
		}

	}

}
