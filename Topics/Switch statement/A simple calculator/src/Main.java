import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long first = scan.nextLong();
        char op = scan.next().charAt(0);
        long second = scan.nextLong();
        long result = 0;

        switch (op) {
            case '+':
                result = first + second;
                System.out.println(result);
                break;
            case '-':
                result = first - second;
                System.out.println(result);
                break;
            case '/':
                if (second == 0) {
                    System.out.println("Division by 0!");
                    break;
                } else {
                    result = first / second;
                    System.out.println(result);
                    break;
                }

            case '*':
                result = first * second;
                System.out.println(result);
                break;

            default:
                System.out.println("Unknown operator");
                break;
        }

    }

}
