package design;

import java.util.Scanner;

public class EmployeeInfo extends AbstractClass{
	
 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to FortuneEmployee class to apply all the fields and attributes.
 * 
 * Important: YOU MUST USE the 
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 * Implement Nested class.
 * Use Exception Handling.
 *
 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	static String companyName;
	private String employeeName;
	private int employeeID;
	private String departmentName;
	private static double salary;
	private char gender;

	
	/*
	 * You must implement the logic for below 2 methods and 
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */
	
	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	public EmployeeInfo(int employeeId){
		this.employeeID = employeeId;
	}
    public EmployeeInfo(String name, int employeeId){
		this.employeeName = name;
		this.employeeID = employeeId;
	}

	public EmployeeInfo(String name, int employeeId, String deptName, double salary, char gender) {
		this.employeeName = name;
		this.employeeID = employeeId;
		this.departmentName = deptName;
		this.salary = salary;
		this.gender = gender;
	}

	public String getName() {
		return employeeName;
	}

	public void setName(String name) {
		this.employeeName = name;
	}

	public int getEmployeeId() {
		return employeeID;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeID = employeeId;
	}

	@Override
	public int employeeId() {
		return employeeID;
	}

	@Override
	public String employeeName() {
		return employeeName;
	}

	public void assignDepartment() {
		this.departmentName = departmentName;

	}

	@Override
	public double calculateSalary() {
		return salary;
	}


	public String getDept(String dept) {
		return departmentName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public static String getCompanyName() {
		return companyName;
	}

	public static void setCompanyName(String companyName) {
		EmployeeInfo.companyName = companyName;
	}
	public void leaveDate (){
		System.out.println("Last day worked is "+endDate);
	}

	@Override
	public void leaveDate(int date) {
		System.out.println(employeeName+"'s last day employed was "+endDate);

	}

	@Override
	public void benefitLayout() {
		System.out.println("You will receive a benefits package upon working for one month!");
	}

	public void annualSalary () {
		double totalSalary = salary*12;
		System.out.println(totalSalary);
		calculateEmployeeBonus(10,50000.00);
	}
	
	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on. 
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 * 
	 */

	//Not sure how to implement with performance rating. Changing parameters a bit.
	public static int calculateEmployeeBonus(int numberOfYearsWithCompany, double totalSalary){
		double totalBonus = 0;
		if (numberOfYearsWithCompany >= 5) {
			totalBonus = totalSalary* 0.1;
		} else if (numberOfYearsWithCompany == 4) {
			totalBonus = totalSalary * 0.08;
		} else if (numberOfYearsWithCompany == 3) {
			totalBonus = totalSalary * 0.06;
		} else if (numberOfYearsWithCompany == 2) {
			totalBonus = totalSalary * 0.04;
		} else {
			totalBonus = 0;
			System.out.println("Work here for a bit longer first.");
		}
		return (int) totalBonus;


	}


	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * 
	 */
	public static int calculateEmployeePension(){
		int total=0;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Please enter start date in format (example: May,2015): ");
		String joiningDate = sc.nextLine();
		System.out.println("Please enter today's date in format (example: August,2017): ");
		String todaysDate = sc.nextLine();
        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
        String convertedTodaysDate = DateConversion.convertDate(todaysDate);

        //implement numbers of year from above two dates
		String startYear = convertedJoiningDate.substring(convertedJoiningDate.length() - 4);
		String currentYear = convertedTodaysDate.substring(convertedTodaysDate.length() - 4);
		int start = Integer.parseInt(startYear);
		int current = Integer.parseInt(currentYear);

		//Calculate pension
		int numberOfYears = current - start;

		if (numberOfYears >= 5) {
			total = (int) (salary * .25);
		} else if (numberOfYears == 4) {
			total = (int) (salary * .20);
		} else if (numberOfYears == 3) {
			total = (int) (salary * .15);
		} else if (numberOfYears == 2) {
			total = (int) (salary * .10);
		} else if (numberOfYears == 1) {
			total = (int) (salary * .05);
		} else if (numberOfYears == 0) {
			total = 0;
		}
		System.out.println("Total pension: $" + total);



		return total;
	}
	private static class DateConversion {

		public DateConversion(Months months){}
		public static String convertDate(String date) {
			String [] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate + "/" + extractMonth[1];
			return actualDate;
		}

		public static int whichMonth(String givenMonth) {
			Months months = Months.valueOf(givenMonth);
			int date = 0;
			switch (months) {
				case January:
					date = 1;
					break;
				case February:
					date = 2;
					break;
				case March:
					date = 3;
					break;
				case April:
					date = 4;
					break;
				case May:
					date = 5;
					break;
				case June:
					date = 6;
					break;
				case July:
					date = 1;
					break;
				case August:
					date = 1;
					break;
				case September:
					date = 1;
					break;
				case October:
					date = 1;
					break;
				case November:
					date = 1;
					break;
				case December:
					date = 1;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}
	}
}
