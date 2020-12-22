package main.api.lang.stringbuffer;

public class Test01 {
    public static void main(String[] args) {

        //String의 문제점

        String str = "";
        for (int i = 0; i < 10000; i++) {
            str += "Hello";
            str += "\n";
        }
        // String의 덧셈 구조적 문제, 메모리에 계속 올리는 구조 - 매우 오래걸림 & 낭비

        StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < 10000; i++) {
            buffer.append("Hello");
            buffer.append("\n");

        }
    }
}
