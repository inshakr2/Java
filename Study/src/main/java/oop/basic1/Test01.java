package main.java.oop.basic1;

public class Test01 {
    public static void main(String[] args) {
        // Message 객체를 1개 생성
        // new : 동적 할당 연산자
        // Message가 바로 객체. 복합 데이터
        // a라는 이름으로 Message 객체를 신규 생성

        Message a = new Message();
        a.sender = "부장님";
        a.text = "OO씨 오늘 수고했고, 내일 늦지말고 출근하세요^^";
        a.time = "오전 1:47";
        a.read = 0;

        // 또 새로운 메세지를 만들 때는 다른 이름으로 생성할 수 있음.
        Message b = new Message();
        b. sender = "나";
        b.text = "bla bla...";
        b.time = "오전 1:48";
        b.read = 0;

    }
}
