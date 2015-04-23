/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteOrmweek11Data {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = week11.Ormweek11PersistentManager.instance().getSession().beginTransaction();
		try {
			week11.Employee lweek11Employee = week11.EmployeeDAO.loadEmployeeByQuery(null, null);
			// Delete the persistent object
			week11.EmployeeDAO.delete(lweek11Employee);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteOrmweek11Data deleteOrmweek11Data = new DeleteOrmweek11Data();
			try {
				deleteOrmweek11Data.deleteTestData();
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
