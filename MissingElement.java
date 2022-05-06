package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElement {
	public static void main(String[]args) {
		Integer[] arr= {1,2,3,4,6,7,8};
		List<Integer> list=new ArrayList<Integer>();
		list.addAll(Arrays.asList(arr));
		Collections.sort(list);
		System.out.println(list);
		for(int i=0; i<list.size()-1;i++) {
			if(list.get(i)!=i+1) {
				System.out.println(i+1);
				break;
			}
		}
		
	}

}
