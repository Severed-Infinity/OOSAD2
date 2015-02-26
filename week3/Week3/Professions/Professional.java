package Week3.Professions;

import java.util.*;

public abstract class Professional {
  private final String name;
  private short yearsWorking = 0;
  private float salary = 0.0f;

  public Professional(String name, short yearsWorking, float salary) {
    this.name = name;
    this.yearsWorking = yearsWorking;
    this.salary = salary;
  }

  public String getName() {
    return this.name;
  }

  public short getYearsWorking() {
    return this.yearsWorking;
  }

  public float getSalary() {
    return this.salary;
  }

  public abstract <Q extends Qualification> Collection addQualification(Collection<Q> c, Q q);

  @Override
  public String toString() {
    return "Professional " + this.getClass().getSimpleName() + " {" +
        "name='" + name + '\'' +
        ", yearsWorking=" + yearsWorking +
        ", salary=" + salary +
        '}';
  }

}