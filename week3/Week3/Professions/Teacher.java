package Week3.Professions;

import java.util.*;

public class Teacher extends Professional {

	protected Collection<Module> attribute;
	protected Collection<Degree> hasDegrees;
	protected Collection<Module> teaches;

    public Teacher(String name, short yearsWorking, float salary) {
        super(name, yearsWorking, salary);
      attribute = new ArrayList<Module>(10);
      hasDegrees = new ArrayList<Degree>(10);
      teaches = new ArrayList<Module>(10);
    }

  @Override
  public <Q extends Qualification> Collection addQualification(final Collection<Q> c, final Q q) {
    c.add(q);
    return c;
  }

  public Collection<Module> getAttribute() {
    return attribute;
  }

  public Collection<Degree> getHasDegrees() {
    return hasDegrees;
  }

  public Collection<Module> getTeaches() {
    return teaches;
  }
}