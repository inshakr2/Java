package main.api.collection4;

import java.util.HashMap;
import java.util.Map;

public class Test01 {
    public static void main(String[] args) {
        // Map(k,v)
        // - 두 개의 데이터를 세트로 저장하는 저장소
        // - K : key, 이름 역할을 수행하며 중복이 불가능
        // - V : value, 값의 역할을 수행하며 중복 가능

        // 저장소 생성
        Map<String, Integer> map = new HashMap<>();

        // 데이터 추가
        map.put("a", 20);

        System.out.println(map.get("a"));

    }
}
