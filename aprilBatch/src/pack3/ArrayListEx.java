package pack3;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		
		List<String> al = new ArrayList<>();
		al.add("Java");
		al.add("123");
		al.add("ABC");
		al.add("Selenium");
		System.out.println(al);
		//al.remove(1);
		//System.out.println(al);
		
		//System.out.println(al.get(1));
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
System.out.println("==================================");

for(String temp : al) {
	System.out.println(temp);
}

		
	}

}
