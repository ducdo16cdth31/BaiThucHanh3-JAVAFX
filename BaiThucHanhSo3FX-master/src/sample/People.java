package sample;

public class People {
    private String name;
    private String old;
    private String subjectLove;

    public People() {
    }

    public People(String name, String old, String subjectLove) {
        this.name = name;
        this.old = old;
        this.subjectLove = subjectLove;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOld() {
        return old;
    }

    public void setOld(String old) {
        this.old = old;
    }

    public String getSubjectLove() {
        return subjectLove;
    }

    public void setSubjectLove(String subjectLove) {
        this.subjectLove = subjectLove;
    }

    @Override
    public String toString() {
        return "" + name + " - " + "cở tuổi: " + old + " - " + subjectLove + "\n";
    }
}
