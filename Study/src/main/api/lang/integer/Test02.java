package main.api.lang.integer;

public class Test02 {
    public static void main(String[] args) {
        // Integer 같은 class를 Wrapper Class라고 한다. (Hybrid 자료형)
        // int가 좋은점, Integer가 좋은점이 있다. (둘은 호환가능)

        // 1. int가 유리한 상황
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);

            // 더군다나 Integer를 사용하려면 더 많은 지식이 필요,,,
        Integer x = new Integer(10);
        Integer y = new Integer(20);
        Integer z = Integer.sum(x, y);
        System.out.println(z.toString());


    }
}
