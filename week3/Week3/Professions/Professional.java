package Week3.Professions;

public class Professional {
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

  @Override
  public String toString() {
    return "Professional " + this.getClass().getSimpleName() + " {" +
        "name='" + name + '\'' +
        ", yearsWorking=" + yearsWorking +
        ", salary=" + salary +
        '}';
  }

}