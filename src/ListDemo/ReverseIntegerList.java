package ListDemo;
import java.util.*;

public class ReverseIntegerList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 20, 30);
        Collections.reverse(nums); // Reverse the list
        System.out.println("Reversed list: " + nums);
    }
}