
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int len = scan.nextInt();
        int[] array = new int[len];
        int max = 0;
        for (int i = 0; i < len; i++) {
            array[i] = scan.nextInt();
        }
        for (int i = 0, j = 1; j < array.length; i++, j++) {
            if (array[i] * array[j] > max) {
                max = array[i] * array[j];
            }
        }
        System.out.println(max);
    }
}
