/**
 * HelloJava
 * -----------
 * A simple Java program to demonstrate:
 * - main() method
 * - command-line arguments
 * - comments and formatting
 */
public class HelloJava {

    public static void main(String[] args) {

        // Print a welcome message
        System.out.println("Hello, Java!");

        // Check if command-line arguments are provided
        if (args.length == 0) {
            System.out.println("No command-line arguments provided.");
        } else {
            System.out.println("Command-line arguments are:");

            // Loop through and print each argument
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + (i + 1) + ": " + args[i]);
            }
        }
    }
}
