package pack1;

/**
 * 
 * @author Sujoy
 *
 */
public class Program11 {

	/** This variable is used to store employee name */
	String empName;
	
	/**
	 * 
	 * @param a - This is the 1st parameter
	 * @param b - This is the 2nd parameter
	 * @return This method returns twice the sum of 2 integers if they are equal else it returns sum
	 * @author Sujoy
	 */
	public int method1(int a, int b) {
		if(a==b) {
			return 2*(a+b);
		}
		else {
			return a+b;
		}
	}
	public static void main(String[] args) {
		Program11 obj = new Program11();
		int result  = obj.method1(14, 25);
		System.out.println(result);
	}
}
