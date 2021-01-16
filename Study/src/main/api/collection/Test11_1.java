package main.api.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test11_1 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("자바");
        list.add("파이썬");
        list.add("C언어");
        list.add("자바스크립트");
        list.add("루비");

        // 내림차순으로 하려면,, 비효율적
//        Collections.sort(list);
//        Collections.reverse(list);
//        System.out.println(list);

//        Comparator<String> c = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o1);
//            }
//        };

        Comparator<String> c = (a, b) -> {
            return b.compareTo(a);
        };
        Comparator<String> c2 = (a, b) -> b.compareTo(a);

        Collections.sort(list, c);
        System.out.println(list);

    }
}
