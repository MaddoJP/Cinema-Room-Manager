import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String checkString = scan.next();
        int startInt = scan.nextInt();
        int endInt = scan.nextInt();
        System.out.println(checkString.substring(startInt,endInt+1));

    }
}