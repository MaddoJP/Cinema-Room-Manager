import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String num = scan.next();
        char a = num.charAt(0);
        char b = num.charAt(1);
        char c = num.charAt(2);
        char d = num.charAt(3);
        if ((a == d) && (b == c)) {
            System.out.println("1");
        } else {
            System.out.println("2");
        }
    }
}