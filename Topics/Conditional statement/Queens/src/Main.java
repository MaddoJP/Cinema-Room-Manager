import java.util.Scanner;

import static java.lang.Math.abs;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        if (a == c) {
            System.out.println("YES");
        } else if (b == d) {
            System.out.println("YES");
        } else if (Math.abs(c-a)==Math.abs(d-b)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}