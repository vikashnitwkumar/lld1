package assiglld1.lld.lambda;

import java.util.Comparator;

public class StudentComparatorByRollNumber implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getRollNumber() - o2.getRollNumber();
    }
}
