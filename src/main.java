import java.util.Scanner;  // Import the Scanner class

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object





        System.out.println("what addition to your log would you like to make?");

        String add = myObj.nextLine();  // Read user input
        System.out.println("Added text: " + add);  // Output user input
    }
}