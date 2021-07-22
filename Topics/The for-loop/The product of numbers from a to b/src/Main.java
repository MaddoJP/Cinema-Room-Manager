import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        long sum = 1;
        for (;a<b;a++) {
            sum *= a;
        }
        System.out.println(sum);
    }
}