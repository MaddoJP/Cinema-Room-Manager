import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        for (; a <= b; a++) {
            if (a % 3 == 0 && a % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (a % 5 == 0) {
                System.out.println("Buzz");
            } else if (a % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(a);
            }
        }
    }
}