import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int k = scan.nextInt();

        int square = n*m;

        if (k > n*m) {
            System.out.println("NO");
        } else if (k < n && k < m) {
            System.out.println("NO");
        } else if (k % m == 0 || k % n == 0) {
            System.out.println("YES");
        }

    }
}