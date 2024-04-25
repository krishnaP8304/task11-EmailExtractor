import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExtractor {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a text containing email addresses
        System.out.println("Enter a text containing email addresses:");
        String text = scanner.nextLine();

        // Close the Scanner after reading input
        scanner.close();

        // Regular expression pattern to match email addresses
        String emailPattern = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b";

        // Create a Pattern object
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(text);

        // Find and display all email addresses
        System.out.println("Email addresses found in the text:");
        while (matcher.find()) {
            String email = matcher.group();
            System.out.println(email);
        }
    }
}
