package Week3.Professions;

public class Degree extends Qualification {

    private String type = "not supplied";
    /**
     * Levels can be between 6 and 10;
     * 6 is a certificates;
     * 7 is a bachelors degree;
     * 8 is an honors bachelors degree;
     * 9 is a masters degree;
     * 10 is a PhD
     */
    private short level = 6;

    public Degree(String name, String university, String type, short level) {
        super(name, university);
        this.type = type;
        this.level = level;
    }

    public String getType() {
        return this.type;
    }

    public short getLevel() {
        return this.level;
    }
}