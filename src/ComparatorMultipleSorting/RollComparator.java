package ComparatorMultipleSorting;

import java.util.Comparator;

public class RollComparator implements Comparator<Students> {

    @Override
    public int compare(Students s1, Students s2) {
        return s1.roll - s2.roll;
    }
}