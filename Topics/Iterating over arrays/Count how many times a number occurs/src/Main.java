import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int counter = 0;
        int len = scan.nextInt();
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = scan.nextInt();
        }
        int target = scan.nextInt();

        for (int i : array) {
            if (i == target) {
                counter ++;
            }
        }
        System.out.println(counter);
    }
}