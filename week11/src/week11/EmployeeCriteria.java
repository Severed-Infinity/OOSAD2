/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
package week11;

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class EmployeeCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression name;
	public final StringExpression address;
	public final StringExpression pps;
	public final StringExpression mobile;
	public final StringExpression startDate;
	public final StringExpression salary;
	
	public EmployeeCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		name = new StringExpression("name", this);
		address = new StringExpression("address", this);
		pps = new StringExpression("pps", this);
		mobile = new StringExpression("mobile", this);
		startDate = new StringExpression("startDate", this);
		salary = new StringExpression("salary", this);
	}
	
	public EmployeeCriteria(PersistentSession session) {
		this(session.createCriteria(Employee.class));
	}
	
	public EmployeeCriteria() throws PersistentException {
		this(week11.Ormweek11PersistentManager.instance().getSession());
	}
	
	public Employee uniqueEmployee() {
		return (Employee) super.uniqueResult();
	}
	
	public Employee[] listEmployee() {
		java.util.List list = super.list();
		return (Employee[]) list.toArray(new Employee[list.size()]);
	}
}

