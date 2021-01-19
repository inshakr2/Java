package main.api.collection3;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test01 {
    public static void main(String[] args) {
//        Set :
//         - 전화번호부 형태의 저장소.
//         - 저장순서가 무시돠고 자체적인 기준에 의해 추가되는 저장소
//         - TreeSet, HashSet
//
//        List : 선형구조 / Set : 비선형구조
//         - 비선형 구조. 특정 값을 찾을 때 속도가 압도적으로 빠르다.
//         - 값을 저장할 때 특정 기준에 의해 정렬이 되면서 저장
//         - 중복이 구조상 불가능.
//         - 빠르게 데이터에 접근하는 것이 목적!

        Set<Integer> a = new TreeSet<>();
        Set<Integer> b = new HashSet<>();

        // Data 등록
        a.add(55);  b.add(55);
        a.add(32);  b.add(32);
        a.add(47);  b.add(47);
        a.add(85);  b.add(85);
        a.add(60);  b.add(60);
        a.add(17);  b.add(17);
        a.add(90);  b.add(90);

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // 개수확인
        a.size();
        // 탐색
        a.contains(77);
        // 삭제
        a.remove(55);

        // 차이점 : .get이 없다.
        // 반복은 확장 반복문만 가능
        // Iterator 로도 가능

    }
}
