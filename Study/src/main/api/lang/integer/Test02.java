package main.api.lang.integer;

public class Test02 {
    public static void main(String[] args) {
        // Integer 같은 class를 Wrapper Class라고 한다. (Hybrid 자료형)
        // int가 좋은점, Integer가 좋은점이 있다. (둘은 호환가능)
        // int는 연산자를 사용하여 계산하는데 특화
        // Integer는 제공되는 메소드를 통해 복잡한 계산에 특화

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


        // 2. Integer가 유리한 상황
        // 30을 2진수로 변환

        int n = 30;
        String res = "";
        for(int i = n; i > 0; i /= 2) {
            res = i % 2 + res;
        }
        System.out.println(res);

        Integer k = new Integer(30);
        System.out.println(Integer.toBinaryString(k));


        // 둘은 서로 호환이 가능하다

        Integer v1 = 10; // int가 Integer로 보관 (값이 포장) ---- auto-boxing
        Integer v2 = new Integer(10); // Integer가 int로 보관 --- auto-boxing

        /**
         *      Wrapper
         *  boolean :   Boolean
         *  byte    :   Byte
         *  short   :   Short
         *  char    :   Character
         *  int     :   Integer
         *  long    :   Long
         *  float   :   Float
         *  double  :   Double
         *
         */


    }
}
