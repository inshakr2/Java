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

    }
}
