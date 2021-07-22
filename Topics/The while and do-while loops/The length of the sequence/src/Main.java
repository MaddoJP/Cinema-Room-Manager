import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter = 0;

        while (scan.hasNext()) {
            if (scan.nextInt() == 0) {
                break;
            }
            counter++;
        }
        System.out.println(counter);
    }
}
