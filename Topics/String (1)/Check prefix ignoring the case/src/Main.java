import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String checkString = scan.next();
        if (checkString.toUpperCase().startsWith("J")) {
            System.out.println("true");
        } else {
            System.out.println(false);
        }
    }

}