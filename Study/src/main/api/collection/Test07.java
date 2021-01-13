package main.api.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        // 사다리 타기
        // 1. 인원수 설정 (2 ~ 24명)
        // 2. 이름 및 항목 설정
        // 3. 사다리 애니메이션 (불필요)
        // 4. 추첨 결과


        Scanner sc = new Scanner(System.in);
        System.out.println("인원수를 입력하세요. 최대 24명까지 입력할 수 있어요.");
        int person = sc.nextInt();

        if (person > 24 || person < 0) {
            System.out.println("1 ~ 24 까지의 숫자를 입력하세요");
            return;
        } else {

            List<String> names = new ArrayList<>();
            List<String> actions = new ArrayList<>();

            // 이름 입력
            System.out.println("이름을 입력하세요.");
            for (int i = 0; i < person; i++) {
                names.add(sc.next());
            }
            // 항목 입력

            System.out.println("항목을 입력하세요.");
            for (int i = 0; i < person; i++) {
                actions.add(sc.next());
            }

            Collections.shuffle(actions);
            System.out.println("당첨 결과!");
            for (int i = 0; i < person; i++) {
                System.out.println(names.get(i) + "\t->\t" + actions.get(i));
            }

        }
    }
}
