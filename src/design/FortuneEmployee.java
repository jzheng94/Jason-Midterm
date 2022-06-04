package design;
import databases.ConnectToSqlDB;
import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {
		EmployeeInfo employee1 = new EmployeeInfo("Jason Zheng",101,"QA",55000.00,'M');
		EmployeeInfo employee2 = new EmployeeInfo("Shagor Chowdhury",102, "QA", 60000.00, 'M');


		System.out.println(employee1.getSalary());
		System.out.println(employee1.getName());
		System.out.println(employee1.getEmployeeId());
		System.out.println(employee1.getDept("QA"));
		System.out.println(employee1.getGender());
		employee1.leaveDate(06/20/2022);
		employee1.calculateSalary();
		employee1.assignDepartment();

		EmployeeInfo.calculateEmployeeBonus(10,80000.00);
		EmployeeInfo.setCompanyName("TD Bank");
		System.out.println(EmployeeInfo.getCompanyName());
		System.out.println(EmployeeInfo.calculateEmployeePension());

		Map<Integer, List<Object>> employeeInfo = new HashMap<Integer, List<Object>>();
		List<Object> emp1 = new ArrayList<Object>();
		emp1.add(employee1.employeeName());
		emp1.add(employee1.employeeId());
		emp1.add(employee1.calculateSalary());

		List<Object> emp2 = new ArrayList<Object>();
		emp2.add(employee2.employeeName());
		emp2.add(employee2.employeeId());
		emp2.add(employee2.calculateSalary());

		employeeInfo.put(1, emp1);
		employeeInfo.put(2, emp2);

//		List empInfo = new ArrayList();
//		empInfo = emp2;

//		ConnectToSqlDB connect = new ConnectToSqlDB();
//		ConnectToSqlDB.connectToSqlDatabase();
//
//		connect.createTableFromStringToMySql("Employee_Records","Emp_Info");
//
//		connect.insertDataFromArrayListToSqlTable(empInfo, "Employee_Records","Emp_Info");
//
//		//converting List<Object> to List<String>
//		List<String> stringList = new ArrayList<String>();
//		List<Object> objectList = Arrays.asList(stringList.toArray());
//
//		connect.readDataBase("Employee_Records","Emp_Info");
		


	}

}
