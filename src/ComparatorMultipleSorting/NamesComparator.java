package ComparatorMultipleSorting;

import java.util.Comparator;

public class NamesComparator implements Comparator<Students> {

	@Override
	public int compare(Students s1, Students s2) {
		// TODO Auto-generated method stub
		
		return s1.name.compareTo(s2.name);
	}

}