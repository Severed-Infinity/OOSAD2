/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListOrmweek11Data {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Employee...");
		week11.Employee[] week11Employees = week11.EmployeeDAO.listEmployeeByQuery(null, null);
		int length = Math.min(week11Employees.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(week11Employees[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Employee by Criteria...");
		week11.EmployeeCriteria lweek11EmployeeCriteria = new week11.EmployeeCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lweek11EmployeeCriteria.ID.eq();
		lweek11EmployeeCriteria.setMaxResults(ROW_COUNT);
		week11.Employee[] week11Employees = lweek11EmployeeCriteria.listEmployee();
		int length =week11Employees== null ? 0 : Math.min(week11Employees.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(week11Employees[i]);
		}
		System.out.println(length + " Employee record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListOrmweek11Data listOrmweek11Data = new ListOrmweek11Data();
			try {
				listOrmweek11Data.listTestData();
				//listOrmweek11Data.listByCriteria();
			}
			finally {
				week11.Ormweek11PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
