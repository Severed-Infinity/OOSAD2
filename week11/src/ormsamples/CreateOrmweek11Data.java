/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateOrmweek11Data {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = week11.Ormweek11PersistentManager.instance().getSession().beginTransaction();
		try {
			week11.Employee lweek11Employee = week11.EmployeeDAO.createEmployee();
			lweek11Employee.setName("bob");
			lweek11Employee.setAddress("98 hilldrive");
			lweek11Employee.setPps("3463423h");
			lweek11Employee.setMobile("975923702");
			lweek11Employee.setStartDate("14/06/11");
			lweek11Employee.setSalary("34231");
			week11.EmployeeDAO.save(lweek11Employee);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateOrmweek11Data createOrmweek11Data = new CreateOrmweek11Data();
			try {
				createOrmweek11Data.createTestData();
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
