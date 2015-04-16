/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateOrmweek10Data {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = ormweek10.Ormweek10PersistentManager.instance().getSession().beginTransaction();
		try {
			for(int i = 0; i < 1000; i++) {
				ormweek10.Employee lormweek10Employee = ormweek10.Employee.createEmployee();
				// Initialize the properties of the persistent object here
				lormweek10Employee.setName("Mr. P Smith");
				lormweek10Employee.setAddress("Old Bawn Tallaght Dublin 24");
				lormweek10Employee.setPps("9893824DY");
				lormweek10Employee.setMobile("0873267514");
				lormweek10Employee.save();
			}
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateOrmweek10Data createOrmweek10Data = new CreateOrmweek10Data();
			try {
				createOrmweek10Data.createTestData();
			}
			finally {
				ormweek10.Ormweek10PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
