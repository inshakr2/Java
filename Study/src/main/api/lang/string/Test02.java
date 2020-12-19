package main.api.lang.string;

public class Test02 {
    public static void main(String[] args) {
        // 포함검사

        String a = "https://www.naver.com";

        System.out.println(a.contains("naver"));

        // 인덱스 번호의 가장 첫번째 출력
        System.out.println(a.indexOf("naver"));
        System.out.println(a.lastIndexOf("."));


    }
}
