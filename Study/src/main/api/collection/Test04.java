package main.api.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Test04 {
    public static void main(String[] args) {
        // 로또 번호 6개 저장
        List<Integer> lotto = new LinkedList<>();
        Random r = new Random();

        while (true) {

            int num = r.nextInt(45) + 1;
            if (!lotto.contains(num)) {

                lotto.add(num);
            }

            if (lotto.size() == 6) {
                break;
            }
        }

        for (int n : lotto) {
            System.out.println("번호 : " + n);
        }
//        for (int i = 0; i < 6; i++) {
//            int n = r.nextInt(45) + 1;
//
//            if(!lotto.contains(n)){
//                lotto.add(n);
//            } else {
//                System.out.println("중복");
//                i--;
//            }
//        }

    }
}
