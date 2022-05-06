package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class ReverseString {
	public static void main(String[]args) {
		List<String> list=new ArrayList<String>();
		list.add("dreams");
		list.add("beautiful");
		System.out.println("Reverse string are: ");
		for(int i=0, j=list.size()-1; i<j; i++)
		{
			list.add(i, list.remove(j));
		}
		System.out.println(list);
			
		}
	}


