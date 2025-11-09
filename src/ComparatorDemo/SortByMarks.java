package ComparatorDemo;

import java.util.Comparator;

class SortByMarks implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.marks - b.marks; // Ascending order //o1<o2=first
        // return b.marks - a.marks; // Descending order////o1>o2=second
    }
}