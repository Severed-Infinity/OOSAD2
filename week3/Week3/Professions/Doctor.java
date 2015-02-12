package Week3.Professions;

import java.util.*;

public class Doctor extends Professional {

	protected Collection<Specialisation> specialisations;

    public Doctor(String name, short yearsWorking, float salary) {
        super(name, yearsWorking, salary);
    }
}