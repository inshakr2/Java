package main.api.lang.object;

//import java.lang.*;

public class Test01 {
    public static void main(String[] args) {

        // Object Class 객체 생성
        Object a = new Object();
        Object b = new Object();

        int v1 = a.hashCode();
        int v2 = b.hashCode();

        System.out.println(v1);
        System.out.println(v2);

        String s1 = a.toString();
        String s2 = b.toString();

        System.out.println(s1);
        System.out.println(s2);

    }
}
