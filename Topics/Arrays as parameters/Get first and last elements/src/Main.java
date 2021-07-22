import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int[] getFirstAndLast(int... array) {
        int firstArrayNumber = array[0];
        int lastArrayNumber = array[array.length - 1];
        return new int[]{firstArrayNumber, lastArrayNumber};
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] result = getFirstAndLast(array);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }
}