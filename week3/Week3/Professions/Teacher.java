package Week3.Professions;

import java.util.*;

public class Teacher extends Professional {

	protected Collection<Module> attribute;
	protected Collection<Degree> hasDegrees;
	protected Collection<Module> teaches;

    public Teacher(String name, short yearsWorking, float salary) {
        super(name, yearsWorking, salary);
    }
}