package pack3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		
		Set<String> hs = new HashSet<>();
		hs.add("Java");
		hs.add("Selenium");
		hs.add("Perl");
		hs.add("Java");
		System.out.println(hs);
		
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
