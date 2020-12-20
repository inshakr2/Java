package main.api.lang.string;

public class Test04 {
    public static void main(String[] args) {
        // 문자열 편집
        // - 대문자를 소문자로 or 소문자를 대문자로

        String addr = "NAVER.COM";
        System.out.println(addr);
        System.out.println(addr.toLowerCase());

        // 공백 제거
        String addr2 = "        naver.com        ";
        System.out.println(addr2.trim());
        String addr2Rep = addr2.replaceAll(" ", "");
        System.out.println(addr2Rep);

        // 연쇄호출 - Method Chaining
        String addr3 = "            NAVER.COM     ";
        System.out.println(addr3.trim().toLowerCase());
    }
}
