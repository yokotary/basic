package objectSample.setSample;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class Set2 {
    public static void main(String[] args) {
        Set<Integer> hashset = new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        for (int i = 100; i > 0; i-=3) {
            hashset.add(i);
            linkedHashSet.add(i);
            treeSet.add(i);
        }
        System.out.println("hashSet");
        System.out.println(hashset);
        System.out.println("linkedHashSet");
        System.out.println(linkedHashSet);
        System.out.println("treeSet");
        System.out.println(treeSet);
    }
}
