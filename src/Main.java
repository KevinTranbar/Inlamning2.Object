import java.util.*;

public class Main {

    public static void main(String[] args) {

        Course c1 = new Course("Kurs1", "Kod1", 5, "Dept1");
        Course c2 = new Course("Kurs2", "Kod2", 2, "Dept1");
        Course c3 = new Course("Kurs3", "Kod3", 6, "Dept1");
        Course c4 = new Course("Kurs4", "Kod4", 3, "Dept2");
        Course c5 = new Course("Kurs5", "Kod5", 9, "Dept2");
        Course c6 = new Course("Kurs6", "Kod6", 1, "Dept2");

        List<Course> courses = new ArrayList<>();

        courses.add(c1);
        courses.add(c2);
        courses.add(c3);
        courses.add(c4);
        courses.add(c5);
        courses.add(c6);

        Collections.sort(courses, new DeptCreditComparator());

        courses.forEach(e->System.out.println(e.name + " " + e.code + " " + e.credit + " " + e.dept));

    }
}
