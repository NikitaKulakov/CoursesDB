public class Courses {
    private String name;
    private int hours;

    Courses() {
    }

    ;

    Courses(String name, int hours) {
        this.name = name;
        this.hours = hours;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}