package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayList1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
//		it is process to creating ArrayList 
		List<Integer> list1 = new ArrayList<Integer>();
			System.out.println("Enter the element : ");
			
//			this an for loop it is used to add limit to ArrayList 
		for (int i = 0; i < 5; i++) {
			list1.add(sc.nextInt());
		}
//	this in an collection interface method to use the sort an arrayList 
		Collections.sort(list1);
		
//		this is an for each loop to print an ArrayList 
		for (Integer num : list1) {
			System.out.println(num);
		}
	}

}
  