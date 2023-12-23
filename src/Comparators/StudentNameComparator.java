package Comparators;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student> {
	
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}
