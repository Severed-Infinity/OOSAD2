/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateOrmweek11Data {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = week11.Ormweek11PersistentManager.instance().getSession().beginTransaction();
		try {
			week11.Employee lweek11Employee = week11.EmployeeDAO.loadEmployeeByQuery(null, null);
			// Update the properties of the persistent object
			week11.EmployeeDAO.save(lweek11Employee);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Employee by EmployeeCriteria");
		week11.EmployeeCriteria lweek11EmployeeCriteria = new week11.EmployeeCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lweek11EmployeeCriteria.ID.eq();
		System.out.println(lweek11EmployeeCriteria.uniqueEmployee());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateOrmweek11Data retrieveAndUpdateOrmweek11Data = new RetrieveAndUpdateOrmweek11Data();
			try {
				retrieveAndUpdateOrmweek11Data.retrieveAndUpdateTestData();
				//retrieveAndUpdateOrmweek11Data.retrieveByCriteria();
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
