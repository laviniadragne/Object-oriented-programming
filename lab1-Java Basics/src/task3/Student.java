package task3;

public class Student {

    String name;
    Integer year;

    public void setName(String name) {

        this.name = name;
    }

    public void setYear(Integer year) {

        this.year = year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
