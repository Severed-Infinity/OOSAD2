package Week3.Professions;

public class Module {

    private final int id;
    private String name = "no name";
    private short maxNumberStudents = 0;

    public Module(int id, String name, short maxNumberStudents) {
        this.id = id;
        this.name = name;
        this.maxNumberStudents = maxNumberStudents;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public short getMaxNumberStudents() {
        return this.maxNumberStudents;
    }
}