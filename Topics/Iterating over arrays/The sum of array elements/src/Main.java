import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int len = scan.nextInt();
        int[] array = new int[len];
        int sum = 0;

        for (int i = 0; i < len; i++) {
            array[i] = scan.nextInt();
        }
        for (int i : array) {
            sum += i;
        }
        System.out.println(sum);
    }
}