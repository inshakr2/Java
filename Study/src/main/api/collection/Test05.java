package main.api.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test05 {
    public static void main(String[] args) {
        // Collection을 보조하는 클래스 : Collections
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        // List도 배열처럼 순서가 중요, 순서와 관련된 조작이 필요
        // - Collections

        Collections.reverse(list);
        System.out.println("list = " + list);
    }
}
