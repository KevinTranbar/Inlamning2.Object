public class Course implements Comparable<Course>{

    String name;
    String code;
    int credit;
    String dept;

    public Course(String name, String code, int credit, String dept) {
        this.name = name;
        this.code = code;
        this.credit = credit;
        this.dept = dept;
    }

    public int compareTo(Course temp) {
        if (this.credit < temp.credit) {
            return -1;
        } else if (this.credit > temp.credit) {
            return 1;
        } else  {
            return 0;
        }
    }

}
