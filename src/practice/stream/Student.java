package practice.stream;

public class Student {
    private String name;
    private int jum;

    public Student(String name, int jum) {
        this.name = name;
        this.jum = jum;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getJum() {
        return jum;
    }
    public void setJum(int jum) {
        this.jum = jum;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", jum=" + jum + "]";
    }
}
