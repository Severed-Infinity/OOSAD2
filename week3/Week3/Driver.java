package Week3;

import Week3.Professions.Teacher;

/**
 * Created by davidswift on 12/02/15.
 */
public class Driver {

    public static void main(String[] args) {
        Teacher t = new Teacher("Mary", (short) 7, 67500.80f);
        StringBuilder sb = new StringBuilder();
        sb.append("Teachers Name : ").append(t.getName()).append("\nNumber of Years Working: ").append(t.getYearsWorking()).append("\nSalary: ").append(t.getSalary());

        System.out.println(sb.toString());
    }
}
