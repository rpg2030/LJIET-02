/* 								Author:Rutul Gajjar
 * 								Doc:10th june 2023
 * 								Obj:WAP create 5 employee object of employee class and show the no of employee 
 * */

package ArrayofObjects;

import java.util.Scanner;

public class Employee{
	String emp_name,emp_dept;
	int emp_id;
	int count=0;
	Scanner sc=new Scanner(System.in);
	public void setdetails() {
		System.out.println("Enter Employee id:");
		emp_id=sc.nextInt();
		System.out.println("Enter Employee name:");
		emp_name=sc.next();
		System.out.println("Enter Employee department:");
		emp_dept=sc.next();
		
		count++;
	}//end of setdetails
	
	public void show() {
		System.out.printf("emp_id:%d\nemp_name:%s\nemp_dept:%s\n",emp_id,emp_name,emp_dept);
	}//end of show
	
	public static void main(String[] args) {
		Employee e[]=new Employee[5];
		
		for(int i=0;i<2;i++) {
			e[i]=new Employee();
			e[i].setdetails();
		}
		for(int i=0;i<2;i++) {
			e[i].show();
		}
	}//end of main
}//end of Employee
