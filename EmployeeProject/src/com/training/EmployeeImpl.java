package com.training;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class EmployeeImpl {
	private List list=new ArrayList<>();
    static Scanner sc=new Scanner(System.in);
    
    public void addEmployee(){
		System.out.println("Enter Employee Details : ");
		System.out.print("Enter Id:");
		int id=sc.nextInt();
		System.out.print("Enter Your Name:");
		String name=sc.next();
		System.out.print("Enter Your Email:");
		String email=sc.next();
		Employee emp=new Employee(id,name,email);
		list.add(emp);
	}
    
    public int searchEmployee(int id){
    	ListIterator itr=list.listIterator();
    	int count=0;
    	while(itr.hasNext()){
    		if(((Employee) itr.next()).getEmpid()==id){
    			return count;
    		}
    		count++;
    	}
    	return -1;
    }
    public void displayEmployee(int id){
		int index=searchEmployee(id);
		if(index==-1){
			System.out.println("Employee Does not Present.");
		}else{
			System.out.println((Employee)list.get(index));
		}
	}
    public void displayAll(){
    	if(list.isEmpty()){
    		System.out.println("No Employee is Present.");
    	}else{
    		ListIterator itr=list.listIterator();
    		while(itr.hasNext()){
    			System.out.println((Employee)itr.next());
    		}
    	}
    }
    public void delEmployee(int id){
    	int index=searchEmployee(id);
		if(index==-1){
			System.out.println("Employee Does not Present.");
		}else{
			list.remove(index);
			System.out.println("Employee Is Deleted");
		}
    }
}
