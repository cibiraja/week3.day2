package week3.day2;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {
	public static void main(String[]args) {
		Set<String>set=new TreeSet<String>();
		set.add("3");
		set.add("2");
		set.add("11");
		set.add("4");
		set.add("6");
		set.add("7");
		List<String> list=new ArrayList<String>(set);
		System.out.println(set);
		String string=list.get(4);
		System.out.println(string);

		
	}

}
