import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int sum = 0;
        for (; a<=b; a++) {
            sum += a;
        }
        System.out.println(sum);
    }
}