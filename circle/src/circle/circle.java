package circle;

import java.util.Scanner;

class circle {
	double radius,area,circumference;
	final double PI=3.14;
	
	public void setRadius() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius:");
		radius=sc.nextDouble();
	}//end of setRadius
	
	public void getArea() {
		System.out.println("Area:"+(PI*radius*radius));
	}//end of gerArea
	
	public void getCircumference(){
		System.out.println("Circumference:"+(PI*radius*2));
	}//end of getCircumference


	public static void main(String[] args) {
		circle c1=new circle();
		c1.setRadius();
		c1.getArea();
		c1.getCircumference();
	}//end of main
}//end of circle