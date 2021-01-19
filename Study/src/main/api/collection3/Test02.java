package main.api.collection3;

import java.util.Comparator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test02 {
    public static void main(String[] args) {
        // 문제
        // 1. 로또번호 6개를 중복없이 추첨해서 저장소에 저장
        // 2. 저장된 번호들을 내림차순이 되도록 구현

        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer x, Integer y) {
                return y - x;
            }
        };
        Set<Integer> lotto = new TreeSet<>(c);
        Random r = new Random();
        while (lotto.size() < 6) {

            lotto.add(r.nextInt(45) + 1);
        }

        for (int n : lotto) {
            System.out.println("번호 = " + n);
        }

    }
}
