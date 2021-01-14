package main.api.collection;

import java.util.ArrayList;
import java.util.List;

public class Test08 {
    public static void main(String[] args) {
        // 남은 List 명령
        // - remove()

        List<Integer> list = new ArrayList<>();
        for (int i = 10; i <= 100; i += 10) {
            list.add(i);
        }
        System.out.println(list);
        // Index 번호로 삭제
        list.remove(0);
        System.out.println(list);

        // 값으로 삭제
        list.remove(new Integer(50));
        list.remove(Integer.valueOf(50));
        System.out.println(list);

        // 전제 삭제
        list.clear();
        System.out.println(list);

    }
}
