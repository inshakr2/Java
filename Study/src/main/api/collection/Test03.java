package main.api.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {

        /**
         * 사용자가 입력한 숫자 5개를 저장하고
         *  "개수" 와 "전체 저장소"를 출력하는 프로그램
         */

        Scanner scanner = new Scanner(System.in);
        List<Integer> res = new ArrayList<>();

        while (res.size() < 5) {
            res.add(scanner.nextInt());
        }

        System.out.println("res = " + res);
        System.out.println("size = " + res.size());
    }
}
