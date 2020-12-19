package main.api.lang.string;

public class Test01 {
    public static void main(String[] args) {

        //1. String 객체 생성자를 이용해 문자열 생성
        String a = new String("Hello Java");

        char[] ch = new char[]{'H', 'e', 'l', 'l', 'o', ' ', 'j', 'a', 'v', 'a'};
        String b = new String(ch);

        // 두 객체 비교
        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));


        System.out.println(a.startsWith("Hello"));

        System.out.println(b.endsWith("java"));

        System.out.println(a.length());

        System.out.println(b.length());
    }
}
