package week3.day2;


import java.util.ArrayList;
import java.util.List;

public class FindIntersection {
	public static void main(String[] args) {
		List<Integer>listList=new ArrayList<Integer>();
		listList.add(3);
		listList.add(2);
		listList.add(11);
		listList.add(4);
		listList.add(6);
		listList.add(7);
		System.out.println("list is:" + listList);
		List<Integer>firstList=new ArrayList<Integer>();
		firstList.add(1);
		firstList.add(2);
		firstList.add(8);
		firstList.add(4);
		firstList.add(9);
		firstList.add(7);
		System.out.println("firstList is:" +firstList);
		listList.retainAll(firstList);
		System.out.println("The common elements in both of the list are:" +listList);

		

	}

}
