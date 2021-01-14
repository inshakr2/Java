package main.api.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test10 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        Collections.shuffle(list);
        System.out.println("list = " + list);

        Collections.sort(list);
        System.out.println("list = " + list);

        // List를 내가 원하는 방식으로 정렬하는 방식 (Custom sort)
        // 내림차순처럼 별도의 정렬방식을 구현하려면 정렬에 해당하는 객체를 생성
        // Comparable , Comparator

        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        };
        Collections.sort(list, c);
        System.out.println("list = " + list);

    }
}
