public class LogicalOperatorApp {
    public static void main(String[] args) {

        // Equals
        String a = "Chany";
        String b = "Chany";

        System.out.println(a == b);
        System.out.println(a.equals(b));

        String c = "yeol";
        String d = new String("yeol");

        System.out.println(c == d);
        System.out.println(c.equals(d));

        // AND
        System.out.println(true && false);
        System.out.println(true && true);

        // or
        System.out.println(true || false);
        System.out.println(true || true);

        //not
        System.out.println(!true);
    }
}
