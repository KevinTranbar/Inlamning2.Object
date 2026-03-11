import java.util.*;

public class DeptCreditComparator implements Comparator<Course> {

    public int compare(Course c1, Course c2) {
        int deptCompare = c1.dept.compareTo(c2.dept);
        if (deptCompare != 0) {
            return deptCompare;
        }

        return Integer.compare(c1.credit, c2.credit);
    }
}
