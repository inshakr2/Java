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


    }
}
