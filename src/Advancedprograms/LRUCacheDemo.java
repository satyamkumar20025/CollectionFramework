package Advancedprograms;

import java.util.*;

public class LRUCacheDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lruCache = new LinkedHashMap<>(3, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
                return size() > 3; // max size = 3
            }
        };

        lruCache.put(1, "A");
        lruCache.put(2, "B");
        lruCache.put(3, "C");
        lruCache.get(1); // access 1
        lruCache.put(4, "D"); // 2 will be removed

        System.out.println("LRU Cache: " + lruCache);
    }
}