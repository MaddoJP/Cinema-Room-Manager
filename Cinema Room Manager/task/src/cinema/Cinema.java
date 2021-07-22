package cinema;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Cinema {

    public static final Scanner scan = new Scanner(System.in);


    public static final char EMPTY_SEAT = 'S';
    public static final char BOOKED_SEAT = 'B';
    public static final int PRICE_FRONT_SEATS = 10;
    public static final int PRICE_BACK_SEATS = 8;
    public static final int SMALL_CINEMA_SIZE = 60;


    public static int rows;
    public static int columns;
    public static int totalSeats;
    public static int frontRows;
    public static int backRows;
    public static int frontRowsIncome;
    public static int backRowsIncome;

    public static int ticketsSold = 0;
    public static int currentIncome = 0;
    public static int ticketPrice = 0;
    public static int maxIncome;

    public static char[][] seatsArr;


    public static void main(String[] args) {

        fillSeats();
        calculateTotalIncome();
        menu(rows, columns);


    }

    private static void fillSeats() {
        System.out.println("Enter the number of rows:");
        rows = scan.nextInt();
        System.out.println("Enter the number of seats in each row:");
        columns = scan.nextInt();
        totalSeats = rows * columns;
        seatsArr = new char[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                seatsArr[i][j] = EMPTY_SEAT;
            }
        }

    }

    public static void menu(int rows, int columns) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Show the seats" + '\n' + "2. Buy a ticket" + '\n' + "3. Statistics" + '\n' + "0. Exit");
        int action = scan.nextInt();
        switch (action) {
            case 1:
                printCinema(rows, columns);
                menu(rows, columns);
                break;
            case 2:
                buyTicket(rows, columns);
                menu(rows, columns);
                break;
            case 3:
                showStatistics();
                menu(rows, columns);
            case 0:
                break;
            default:
                System.out.println("Choose a number from 0 to 3!");
                menu(rows, columns);
                break;
        }

    }

    private static void showStatistics() {
        DecimalFormat f = new DecimalFormat("#.##");
        System.out.println("\nNumber of purchased tickets: " + ticketsSold);
        double percentageSold = ticketsSold * 1.00 / totalSeats * 100;
        System.out.printf("Percentage:% .2f%%", percentageSold);
        System.out.println();
        System.out.println("Current income: $" + currentIncome);
        System.out.println("Total income: $" + maxIncome);
        System.out.println();

    }

    public static void printCinema(int rows, int columns) {
        System.out.println("\nCinema:");
        System.out.print("  ");

        for (int i = 1; i < columns + 1; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < rows; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < columns; j++) {
                System.out.print(seatsArr[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void buyTicket(int rows, int columns) {
        System.out.println("\nEnter a row number:");
        int row = scan.nextInt();
        System.out.println("Enter a seat number in that row:");
        int column = scan.nextInt();
        System.out.println();

        if (row > rows || column > columns || row < 0 || columns < 0) {
            System.out.println("Wrong input!");
            buyTicket(rows, columns);
        } else if (seatsArr[row - 1][column - 1] == BOOKED_SEAT){
                System.out.println("That ticket has already been purchased!");
                buyTicket(rows, columns);
            } else {
                seatsArr[row - 1][column - 1] = BOOKED_SEAT;
                ticketsSold++;
            }


        ticketPrice = calculatePrice(row);
        currentIncome += ticketPrice;

        System.out.format("Ticket price: $%d%n", ticketPrice);

    }

    public static int calculatePrice(int row) {
        if (totalSeats <= SMALL_CINEMA_SIZE) {
            return PRICE_FRONT_SEATS;
        } else {
            if (row <= rows / 2) {
                return PRICE_FRONT_SEATS;
            } else {
                return PRICE_BACK_SEATS;
            }
        }
    }

    public static void calculateTotalIncome() {
        if (totalSeats <= SMALL_CINEMA_SIZE) {
            maxIncome = totalSeats * PRICE_FRONT_SEATS;
        } else {
            frontRows = (rows / 2) * columns;
            frontRowsIncome = frontRows * PRICE_FRONT_SEATS;
            backRows = totalSeats - frontRows;
            backRowsIncome = backRows * PRICE_BACK_SEATS;
            maxIncome = frontRowsIncome + backRowsIncome;
        }
    }
}