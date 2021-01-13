package main.api.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Test06 {
    public static void main(String[] args) {

        // 여섯명 중 2명을 추첨
        List<String> person = new ArrayList();

        person.add("철수");
        person.add("영희");
        person.add("영수");
        person.add("민지");
        person.add("미영");
        person.add("민수");

        Collections.shuffle(person);
        List<String> winner = person.subList(0, 2);
        System.out.println("winner = " + winner);
    }
}
