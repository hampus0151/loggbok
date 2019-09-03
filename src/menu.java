import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class menu {
    public menu() {
    }

    public static void main(String[] args) {
        System.out.println("Example Program");
        System.out.println("");
        System.out.println("Menu Options:");
        System.out.println("1. ");
        System.out.println("2. ");
        System.out.println("3. ");
        System.out.println("4. ");
        System.out.println("5. ");
        System.out.println("6. Exit");
        System.out.print("Please select an option from 1-6\r\n");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int input = Integer.parseInt(br.readLine());

            if(input < 0 || input > 6) {
                System.out.println("You have entered an invalid selection, please try again\r\n");
            } else if(input == 6) {
                System.out.println("You have quit the program\r\n");
                System.exit(1);
            } else {
                System.out.println("You have entered " + input + "\r\n");
            }
        } catch (IOException ioe) {
            System.out.println("IO error trying to read your input!\r\n");
            System.exit(1);
        }
    }
}