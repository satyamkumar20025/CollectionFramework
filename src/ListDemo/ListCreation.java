package ListDemo;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListCreation {
    public static void main(String[] args) throws Exception {

        // Capacity check using reflection
        ArrayList<Integer> intList = new ArrayList<>(11);
        for (int i = 0; i < 11; i++) intList.add(1);

        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);
        Object[] elementData = (Object[]) field.get(intList);
        System.out.println("Initial capacity: " + elementData.length);

    }
}