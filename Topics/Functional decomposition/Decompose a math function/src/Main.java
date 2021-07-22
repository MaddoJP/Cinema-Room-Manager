import java.util.Scanner;

class MultipleFunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println(f(x));
    }

    public static double f(double x) {
        if (x <= 0) {
            return f1(x);
        } else if (x >= 1) {
            return f3(x);
        } else {
            return f2(x);
        }
    }

    //implement your methods here
    public static double f1(double y) {
        return y * y + 1;
    }

    public static double f2(double y) {
        return 1 / (y * y);
    }

    public static double f3(double y) {
        return y * y - 1;
    }
}