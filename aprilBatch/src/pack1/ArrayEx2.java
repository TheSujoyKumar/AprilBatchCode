package pack1;

public class ArrayEx2 {

	public static void main(String[] args) {
		
		int twoDArray[][] = {{2,5,7},{6,8,9},{1,9,3}};
		System.out.println(twoDArray.length);
		for(int i=0;i<twoDArray.length;i++) {//Row
			
			for(int j=0;j<twoDArray[i].length;j++) {
				System.out.print(twoDArray[i][j]);
			}
			System.out.println("");
		}
		
		
		String name = "Sujoy";
		System.out.println(name.length());
	}
}
