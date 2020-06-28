package june27;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetsDemo {

	public static void main(String[] args) {
		
		List<String> namesList = Arrays.asList("Murad","Kamil", "Murad", "Murad","Kamil" );
		
		Set<String> names = new HashSet<String>();
		
		names.add("Murad");
		names.add("Kamil");
		names.add("Saida");
		names.add("Iuliia");
		names.add("Kamil");
		names.add("Saida");
		
		names.add(null);
		
		
		System.out.println("Hashset: " +  names);
		Set<String> names2 = new HashSet<String>(namesList);
		
		
		
		Set<String> names3 = new LinkedHashSet<String>();
		
		names3.add("Murad");
		names3.add("Kamil");
		names3.add("Saida");
		names3.add("Iuliia");
		names3.add(null);
		names3.add(null);
		
		
		System.out.println("LinkedHashSet  " + names3);
		
		
		Set<String> names4 = new TreeSet<String>();
		
		names4.add("Murad");
		names4.add("Kamil");
		names4.add("Saida");
		names4.add("Iuliia");
		
	//	names4.add(null);
		
		System.out.println("Treeset: " + names4);







	}

}
