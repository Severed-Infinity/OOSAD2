package Week3.Professions;

import java.util.*;

public class Pilot extends Professional {

	protected Collection<Rating> ratings;

    public Pilot(String name, short yearsWorking, float salary) {
        super(name, yearsWorking, salary);
    }

  @Override
  public <Q extends Qualification>Collection addQualification(final Collection<Q> c, final
  Q q) {
    return c;
  }
}