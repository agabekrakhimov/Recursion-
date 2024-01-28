import java.util.Scanner;

public class Person {

    public static void main(String[] args) {
        // create a scanner object to read user input
        Scanner sc = new Scanner(System.in);
        // ask the user for the number of people in the room
        System.out.println("How many people are in the room?");
        // read the input as an integer
        int n = sc.nextInt();
        // close the scanner
        sc.close();
        // call the handshake function and store the result
        int h = handshake(n);
        // print the result
        System.out.println("If everyone shakes hands once, there will be " + h + " handshakes.");
    }

    public static int handshake(int n) {
        // base case: no handshakes if there is only one person or none
        if (n <= 1) {
            return 0;
        }
        // recursive case: n-1 handshakes for the last person plus the handshakes in a room of n-1 people
        else {
            return (n-1) + handshake(n-1);
        }
    }
}