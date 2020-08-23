public class AuthApp {
    public static void main(String[] args) {

        String id = "Chany";
        String inputID = args[0];

        String pass = "1111";
        String inputPass = args[1];

        System.out.println("Hi");

        if (id.equals(inputID) && pass.equals(inputPass)) {
            System.out.println("Master !");
        } else {
            System.out.println("Who Are You?");
        }
    }
}
