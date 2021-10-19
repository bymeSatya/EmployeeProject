package com.training;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		EmployeeImpl e=new EmployeeImpl();
		Scanner sc=new Scanner(System.in);
		int choice;
		do{
			System.out.println("1.Add Employee");
			System.out.println("2.Search Employee");
			System.out.println("3.Delete Emplyee");
			System.out.println("4.Display All Employee");
			System.out.println("5.Display Employee");
			System.out.println("0.Close Application.");
			System.out.print("Enter Your Choice:");
			choice=sc.nextInt();
			switch(choice){
			case 1:e.addEmployee();
			       break;
			case 2:e.searchEmployee(sc.nextInt());
			       break;
			case 3:e.delEmployee(sc.nextInt());
			       break;
			case 4:e.displayAll();
			       break;
			case 5:e.displayEmployee(sc.nextInt());
			       break;
			case 0:System.out.println("Application Colsed.");
				System.exit(0);
			}
		}while(choice!=0);
	}

}
