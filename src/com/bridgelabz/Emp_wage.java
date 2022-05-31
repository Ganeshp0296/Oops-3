package com.bridgelabz;

public class Emp_wage {

//	public int employeeHrs, employeeRate = 20, totalEmployeeWage = 0, totalEmployeeHrs = 0, totalWorkDay = 0; //instance variable
	
	public  void CompanyABC(){

	    int employeeHrs, employeeRate = 20, totalEmployeeWage = 0, totalEmployeeHrs = 0, totalWorkDay = 0; //local variable

	    while (totalEmployeeHrs <= 100 && totalWorkDay < 20) {
	        int employee = (int) Math.floor ( Math.random () * 10 ) % 3;
	        totalWorkDay++;
	        switch (employee) {
	            case 0:
	                System.out.println ( "Employee is Absent" );
	                employeeHrs = 0;
	                break;
	            case 1:
	                System.out.println ( "Employee is Present" );
	                employeeHrs = 8;
	                break;
	            default :
	                System.out.println ( "Employee doing Part Time" );
	                employeeHrs = 3;
	                break;
	        }
	        totalEmployeeHrs = totalEmployeeHrs + employeeHrs;
	        System.out.println ( "Day " + totalWorkDay + " Employee Hours: " + employeeHrs );
	        System.out.println("------------------------------------------");
	    }
	    totalEmployeeWage = totalEmployeeHrs * employeeRate;
	    System.out.println("Final wage calculation of company ABC");
	    System.out.println ( "Total Working Hours: " + totalEmployeeHrs );
	    System.out.println ( "Total Employee wage for a Month Rs. " + totalEmployeeWage );
	    System.out.println("<---------------------------------------------->");
	}
	
	
	public  void CompanyXYZ(){

	    int employeeHrs, employeeRate = 30, totalEmployeeWage = 0, totalEmployeeHrs = 0, totalWorkDay = 0; //local variable

	    while (totalEmployeeHrs <= 120 && totalWorkDay < 30) {
	        int employee = (int) Math.floor ( Math.random () * 10 ) % 3;
	        totalWorkDay++;
	        switch (employee) {
	            case 0:
	                System.out.println ( "Employee is Absent" );
	                employeeHrs = 0;
	                break;
	            case 1:
	                System.out.println ( "Employee is Present" );
	                employeeHrs = 8;
	                break;
	            default :
	                System.out.println ( "Employee doing Part Time" );
	                employeeHrs = 3;
	                break;
	        }
	        totalEmployeeHrs = totalEmployeeHrs + employeeHrs;
	        System.out.println ( "Day " + totalWorkDay + " Employee Hours: " + employeeHrs );
	        System.out.println("------------------------------------------");
	    }
	    totalEmployeeWage = totalEmployeeHrs * employeeRate;
	    System.out.println("Final Wage Calculation Of company XYZ");
	    System.out.println ( "Total Working Hours: " + totalEmployeeHrs );
	    System.out.println ( "Total Employee wage for a Month Rs. " + totalEmployeeWage );
	    System.out.println("<---------------------------------------------->");
	}
	
	
	public  void CompanyPQR(){

	    int employeeHrs, employeeRate = 40, totalEmployeeWage = 0, totalEmployeeHrs = 0, totalWorkDay = 0; //local variable

	    while (totalEmployeeHrs <= 80 && totalWorkDay < 25) {
	        int employee = (int) Math.floor ( Math.random () * 10 ) % 3;
	        totalWorkDay++;
	        switch (employee) {
	            case 0:
	                System.out.println ( "Employee is Absent" );
	                employeeHrs = 0;
	                break;
	            case 1:
	                System.out.println ( "Employee is Present" );
	                employeeHrs = 8;
	                break;
	            default :
	                System.out.println ( "Employee doing Part Time" );
	                employeeHrs = 3;
	                break;
	        }
	        totalEmployeeHrs = totalEmployeeHrs + employeeHrs;
	        System.out.println ( "Day " + totalWorkDay + " Employee Hours: " + employeeHrs );
	        System.out.println("------------------------------------------");
	    }
	    totalEmployeeWage = totalEmployeeHrs * employeeRate;
	    System.out.println("Final Wage Calculation Of company PQR");
	    System.out.println ( "Total Working Hours: " + totalEmployeeHrs );
	    System.out.println ( "Total Employee wage for a Month Rs. " + totalEmployeeWage );
	}
	
	
}
	


class Main extends Emp_wage {  // use inheritance
	public static void main(String[] args) {
		System.out.println("Welcome to Employee wage computution program");
		Main Emp_wage = new Main(); //creating object of parent class
		Emp_wage.CompanyABC();
		Emp_wage.CompanyXYZ();
		Emp_wage.CompanyPQR();
	}
}
