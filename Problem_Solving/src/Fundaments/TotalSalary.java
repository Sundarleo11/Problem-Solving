package Fundaments;

import java.util.Scanner;

public class TotalSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*Write a program to calculate the total salary of a person. 
		 * The user has to enter the basic salary (an integer) and the grade (an uppercase character), 
		and depending upon which the total salary is calculated as -
		 totalSalary = basic + hra + da + allow – pf
		where :
		hra   = 20% of basic
		da    = 50% of basic
		allow = 1700 if grade = ‘A’
		allow = 1500 if grade = ‘B’
		allow = 1300 if grade = ‘C' or any other character
		pf    = 11% of basic.
		Round off the total salary and then print the integral part only.
		Note: Try finding out a function on the internet to do so
		Input format :
		Basic salary & Grade (separated by space)
		Output Format :
		Total Salary
		Constraints :
		0 <= Basic Salary <= 7,500,000
		Sample Input 1 :
		10000 A
		Sample Output 1 :
		17600*/
		Scanner sc=new Scanner(System.in);
		int salary;
		float hra,da,allow,pf;
		
		 salary=sc.nextInt();
		hra=((salary * 20)/100);
		da= ((salary * 50)/100);
		pf=((salary * 11)/100);
		char ch=sc.next().charAt(0);
		
		
		int totalSalary;
		
		if(ch=='a') {
			totalSalary=  (int) ((salary+hra+da+1700)-pf);
			System.out.println(totalSalary);
			
		}else if(ch=='b') {
			totalSalary=  (int) ((salary+hra+da+1500)-pf);
			System.out.println(totalSalary);
			
		}else {
			totalSalary=  (int) ((salary+hra+da+1300)-pf);
			System.out.println(totalSalary);
		}
		
		
		

	}

}
