package main.api.lang.object;

import java.util.HashMap;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        // Object는 모든 클래스의 조상
        //  = 업캐스팅!

        Object a = 10;
        Object b = "Hello";
        Object c = 3.14;
        Object d = new int[12];
        Object e = new HashMap<String, String>();
        Object f = new Scanner(System.in);

        // - 형태검사
        //   a 는 String 인가?  false
        //   b 는 String 인가?  true
        System.out.println(a instanceof String);
        System.out.println(b instanceof String);
    }
}
