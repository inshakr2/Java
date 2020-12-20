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

        // 문자열 나누기
        String addr4 = "유창열";
        String firstName = addr4.substring(1, 3);
        String lastName = addr4.substring(0, 1);
        System.out.println("firstName = " + firstName);
        System.out.println("lasgName = " + lastName);
    }
}
