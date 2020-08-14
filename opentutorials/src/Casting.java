public class Casting {
    public static void main(String[] args) {

        double a = 1.1;
        double b = 1;
        double b2 = (double) 1;
        System.out.println(a);
        System.out.println(b);
        // No Problem

        int c = (int) 1.1;
        // 1, Data 손실이 있을 수 있기 때문에 명시적으로 Cast

        // int to String casting
        String d = Integer.toString(1);
        System.out.println(d.getClass());
        System.out.println(d + 1);
    }
}
