package main.api.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test02 {
    public static void main(String[] args) {
        // List : 순서가 유지되는 대용량 저장소
        //  - ArrayList : 배열 형태로 붙어있는 저장소
        //  - LinkedList : 연결 형태로 떨어져 있는 저장소

        // ArrayList
//        ArrayList a = new ArrayList();
//        List b = new ArrayList();
//
//        LinkedList c = new LinkedList();
//        List d = new LinkedList();
//
//
//        // 배열과 틀린점 - 자료형 저장
//        int[] e = new int[5];

        // 생성 방식 -> Generic을 사용하여 형태를 명시
        List<String> e = new ArrayList<String>();
        List<String> e1 = new ArrayList<>();

        // 아무것도 입력하지 않으면, object가 저장됨. 그렇지만 object더라도 명시하기를 권장 ( 물음표(?) 로 대체 가능 )
        List<?> e2 = new LinkedList<>();


        // 데이터 추가 : add() - Generic에 명시된 형태만 추가 가능
        e.add("한국");
        e.add("미국");
        e.add("중국");
        e.add("일본");
        e.add("러시아");
        // 배열에서는 idx를 바꿔가면서 넣어주는데 List는 그냥 add

        System.out.println("e = " + e);
        System.out.println("size = " + e.size());
        System.out.println("is empty ? " + e.isEmpty());

    }
}
