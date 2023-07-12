package Projects_OOP.Seminar03.study_group.student.comparators;

import Projects_OOP.Seminar03.study_group.group.GroupItem;
import java.util.Comparator;

public class StudentComparatorByName<E extends GroupItem> implements Comparator<E> {
    @Override
    public int compare(E o1, E o2) {
        return o1.getName().compareTo(o2.getName());
    }
}