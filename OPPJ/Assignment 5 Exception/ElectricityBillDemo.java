
import java.util.*;
import java.util.Scanner;

class ElectricityBill {
	private String customerName;
	private double unitsConsumed;
	private double billAmount;
	
	public ElectricityBill(String customerName,double unitsConsumed){
		if (unitsConsumed<0){
			throw new IllegalArgumentException("Error: units can not be negative");
		}
		this.customerName=customerName;
		this.unitsConsumed=unitsConsumed;
	}
	public void calculateBillAmount(){
		if(unitsConsumed <= 100){
			billAmount=unitsConsumed*5;
		}else if (unitsConsumed <= 300){
			billAmount=(100 * 5)+((unitsConsumed-100)*7);
		}else{
			billAmount=(100*5)+(200*7)+((unitsConsumed-300)*10);
		}
	}
	
	public void displayBill(){
		System.out.println("Electricity Bill Details:");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Total Bill Amount: Rs" + billAmount);
	}
}
public class ElectricityBillDemo {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		try{
			System.out.println("Enter customer Name: ");
			String name = sc.nextLine();
			
			System.out.println("Enter units consumed: ");
			double units = sc.nextDouble();
			
			//created ElectricityBill object
			ElectricityBill bill = new ElectricityBill(name,units);
			bill.calculateBillAmount();
			bill.displayBill();
		}
		catch(InputMismatchException e){
			System.out.println("Error: enter vaild numeric data");
		}
		catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
	}
}

//OUTPUT
/*
C:\Nisha OOPJ\Assignment 5 Exception>java ElectricityBillDemo
Enter customer Name:
nisha
Enter units consumed:
300
Electricity Bill Details:
Customer Name: nisha
Units Consumed: 300.0
Total Bill Amount: Rs1900.0

//OUTPUT 2
C:\Nisha OOPJ\Assignment 5 Exception>java ElectricityBillDemo
Enter customer Name:
Vaibhav
Enter units consumed:
-10
Error: units can not be negative		

//OUTPUT 3

C:\Nisha OOPJ\Assignment 5 Exception>java ElectricityBillDemo
Enter customer Name:
Vaibhav
Enter units consumed:
abc
Error: enter vaild numeric data

*/