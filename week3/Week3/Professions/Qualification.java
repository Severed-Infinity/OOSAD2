package Week3.Professions;

public class Qualification {
  private final String name;
  private String university = "not supplied";

  public Qualification(String name, String university) {
    this.name = name;
    this.university = university;
  }

  public String getName() {
    return this.name;
  }

  public String getUniversity() {
    return this.university;
  }

  @Override
  public String toString() {
    return "Qualification{" +
        "name='" + name + '\'' +
        ", university='" + university + '\'' +
        '}';
  }
}