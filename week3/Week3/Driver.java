package Week3;

import Week3.Professions.*;

/**
 * Created by davidswift on 12/02/15.
 */
public class Driver {
  public static void main(String[] args) {
    Teacher t = new Teacher("Mary", (short)7, 67500.80f);
    System.out.println(
        "Teachers Name : " + t.getName() + "\nNumber of Years Working: " + t.getYearsWorking() +
            "\nSalary: " + t.getSalary());
    System.out.println(t);

    Doctor doctor = new Doctor("Ken", (short)20, 80000.80f);
    System.out.println(doctor.toString());
  }
}
