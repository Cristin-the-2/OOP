package Projects_OOP.Seminar03.study_group.group;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Projects_OOP.Seminar03.study_group.group.iterators.StudentIterator;
import Projects_OOP.Seminar03.study_group.student.comparators.StudentComparatorByAge;
import Projects_OOP.Seminar03.study_group.student.comparators.StudentComparatorByName;

public class StudyGroup<E extends GroupItem> implements Iterable<E> {
    private List<E> studentList;

    public StudyGroup() {
        studentList = new ArrayList<>();
    }

    public void addStudent(E student){
        studentList.add(student);
    }

    @Override
    public Iterator<E> iterator() {
        return new StudentIterator<>(studentList);
    }

    public void sortByName(){
        studentList.sort(new StudentComparatorByName<>());
    }

    public void sortByAge(){
        studentList.sort(new StudentComparatorByAge<>());
    }
}