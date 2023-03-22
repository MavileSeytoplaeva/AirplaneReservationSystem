import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        task();
//        You’re to write an application to assign seats on each flight of the airline’s only plane (capacity: 10 seats).
//        Your application should display the following alternatives: Please type 1 for First Class and Please type 2 for Economy.
//                If the user types 1, your application should assign a seat in the first class section (seats 1–5).
//        If the user types 2, your application should assign a seat in the economy section (seats 6–10).
//                Your application should then display a boarding pass indicating the person’s seat number and whether it’s in the first-class or economy section of the plane.
//        Use a one-dimensional array of primitive type boolean to represent the seating chart of the plane. Initialize all the elements of the array to false to indicate that all the seats are empty.
//        As each seat is assigned, set the corresponding element of the array to true to indicate that the seat is no longer available.
//                Your application should never assign a seat that has already been assigned. When the economy section is full, your application should ask the person if it’s acceptable to be placed in the
//                first-class section (and vice versa). If yes, make the appropriate seat assignment. If no, display the message “Next flight leaves in 3 hours.”
    }

    public static String chooseClass(int classes) {
        if (classes == 1) {
//                System.out.println("There are 5 available seats in the first class section. Choose from 6 to 10");
            return "There are 5 available seats in the first class section. Choose from 6 to 10";
        } else if (classes == 2) {
//            System.out.println("There are 5 available seats in the economy class section. Choose from 1 to 5");
            return "There are 5 available seats in the economy class section. Choose from 1 to 5";
        } else {
            return "You didn't type 1 or 2";
        }
    }
    public static String chooseSeat(int seat) {
        boolean[] isReserved = new boolean[10];
        if (seat <= 5) {
            isReserved[seat-1] = true;
            return "Your seat number is "+seat+" and it is in the economy class.";
        } else if (seat <= 10) {
            isReserved[seat-1] = true;
            System.out.println(Arrays.toString(isReserved));
            return "Your seat number is " + seat + " and it is in the first class.";
        } else {
            return "There is no seat number "+seat;
        }

    }

    public static void task() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type 1 for first Class and 2 for Economy class");
        String classes1 = chooseClass(scanner.nextInt());
        System.out.println(classes1);
        String seats = chooseSeat(scanner.nextInt());
        System.out.println(seats);


            }

    }


