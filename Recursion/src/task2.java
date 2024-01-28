import java.util.Scanner;

public class task2{

    public static void main(String[] args) {
        // create a scanner object to read user input
        Scanner sc = new Scanner(System.in);
        // ask the user for the value of n
        System.out.println("Enter value for n:");
        // read the input as an integer
        int n = sc.nextInt();
        // ask the user for the value of r
        System.out.println("Enter value for r:");
        // read the input as an integer
        int r = sc.nextInt();
        // close the scanner
        sc.close();
        // check if n is greater than r
        if (n >= r) {
            // call the combination function and store the result
            int c = combination(n,r);
            // print the result
            System.out.println("There are " + c + " possible combinations.");
        }
        else {
            // print an error message
            System.out.println("Invalid input. n should be greater than or equal to r.");
        }

    }

    public static int combination(int n, int r) {
        // base case: only one combination if r is zero or equal to n
        if (r == 0 || r == n) {
            return 1;
        }
        // recursive case: add the combinations of choosing r-1 from n-1 and choosing r from n-1
        else {
            return combination(n-1,r-1) + combination(n-1,r);
        }
    }
}

