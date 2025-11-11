package ListDemo;

import java.util.ArrayList;
import java.util.List;

public class removeduplicates {
	public static void main(String[] args) {
	List<Integer>kalu=new ArrayList<>();{
		kalu.add(4);
		kalu.add(5);
		kalu.add(45);
		kalu.add(4);
		kalu.add(45);
		kalu.add(10);
		kalu.add(4);
		kalu.add(45);
		kalu.add(10);
		
		
        List<Integer> uniqueList = new ArrayList<>();
        for (Integer num : kalu) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }

        System.out.println(uniqueList);
	}
    
	

}
}