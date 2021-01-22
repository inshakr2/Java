package main.api.collection3;

import java.util.Set;
import java.util.TreeSet;

public class Test03 {
    public static void main(String[] args) {
        // Set은 집합연산에 특화되어 있다.
        // 합집합 , 차집합 , 교집합

        Set<Integer> a = new TreeSet<>();
        a.add(10);
        a.add(20);
        a.add(30);

        Set<Integer> b = new TreeSet<>();
        b.add(20);
        b.add(30);
        b.add(40);
        b.add(50);

        // 합집합 : addAll
        Set<Integer> c = new TreeSet<>();
        c.addAll(a);
        c.addAll(b);
        System.out.println("c = " + c);

        // 교집합 : retainAll
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println("d = " + d);

        // 차집합 : removeAll
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println("e = " + e);
    }
}
