package pack1;

public class BreakEx4 {

	public static void main(String[] args) {
		
		boolean x = true;
		
		First: {
			Second: {
				Third: {
					if (x) {
						break Second;
					}
					System.out.println("Third block executed");
				}
				System.out.println("Second block executed");
			}
			System.out.println("First block executed");
		} // End of First

	}//End of main

}
