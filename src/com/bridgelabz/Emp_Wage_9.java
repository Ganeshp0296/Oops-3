package com.bridgelabz;

public class Emp_Wage_9 {


		public static final int IS_PART_TIME = 1;
		public static final int IS_FULL_TIME = 2;
//		public static final int EMP_RATE_PERHR = 20;
//		public static final int NUM_OF_WORKING_DAYS = 2;
//		public static final int MAX_HRS_IN_MONTH = 10;
//		
		public static int computeEmpWage(String company, int EMP_RATE_PERHR, int NUM_OF_WORKING_DAYS, int MAX_HRS_IN_MONTH) {

			int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
			
			while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
				totalWorkingDays++;	
					
				int empCheck = (int) Math.floor(Math.random() * 10) % 3; 
				
				switch (empCheck) {
				  case IS_PART_TIME:
					 empHrs = 4;
					 break;
						case IS_FULL_TIME:
							empHrs = 8;
							break;
						default:
							empHrs = 0;
					}
					
					totalEmpHrs += empHrs;
					System.out.println("Day#: " + totalWorkingDays + "Emp Hr: " +empHrs);
				}				
					
				int totalEmpWage = totalEmpHrs * EMP_RATE_PERHR;
				System.out.println("Total Emp Wage for Company: " +company+" is: "+ totalEmpWage);
				return totalEmpWage;	
				}
		
			public static void main(String[] args) {
				computeEmpWage("DailyBazar",20, 20, 10);
				computeEmpWage("Reliance",10, 25, 20);
				computeEmpWage("Whizstorm",40, 30, 30);			
				  
			}
	}
