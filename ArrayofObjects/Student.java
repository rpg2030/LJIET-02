/* 								Author:Rutul Gajjar
 * 								Doc:10th june 2023
 * 								Obj:WAP using do While loop create array of 5 student  
 * */

package ArrayofObjects;

import java.util.Scanner;

public class Student {
	String name;
	int roll_no,marks;
	Scanner sc=new Scanner(System.in);
	public void setDetails() {
		System.out.println("Enter Student name:");
		name=sc.next();
		System.out.println("Enter roll_no:");
		roll_no=sc.nextInt();
		System.out.println("Enter marks:");
		marks=sc.nextInt();
	}//end of setDetails
	public void show() {
		System.out.printf("name:%s\nroll_no:%d\nmarks:%d\n",name,roll_no,marks);
	}//end of show
			
	public static void main(String[] args) {
		Student s[]=new Student[5];
		int i=0;
		do {
			s[i]=new Student();
			s[i].setDetails();
			i++;
		}while(i<5);
		
		i=0;
		do {
			s[i].show();
			i++;
		}while(i<5);
	}//end of main
}//end of Student
