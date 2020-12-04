package main.java.oop.constructor2;

public class test02 {
    public static void main(String[] args) {

        // 주전선수
        Player entry = new Player("손흥민", "공격수", "토트넘", 3, 1, 90);

        // 후보선수
        Player bench = new Player("케인", "공격수", "토트넘");

        // 입력 매개변수에 따라서 다양하게 호출할 수 있다!
    }
}
