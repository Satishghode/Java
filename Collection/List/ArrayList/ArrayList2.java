package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Student {
	int rollno;
	String name; 
	long phoneno;
	String addres ;
	
	Student(int rollno, String name , long phoneno , String addres){
		this.rollno=rollno;
		this.name=name;
		this.phoneno=phoneno;
		this.addres= addres;
	}
	
}



public class ArrayList2 {
	
	
	
	
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			// Student s ;
			List list = new ArrayList<Student>();
			
				list.add(new Student(101,"satish", 123456 ,"sukewadi"));
				
				
				Iterator itr = list.iterator();
				while(itr.hasNext()) {
					Student s = (Student) itr.next();
					
					System.out.println(s.rollno);
				}
			

		}
}
   