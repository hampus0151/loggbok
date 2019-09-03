import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        System.out.println("Loggbok");
        System.out.println("Menu Options:");
        System.out.println("1. visa");
        System.out.println("2. skriv ny");
        System.out.println("3. redigera");
        System.out.println("4. spara");
        System.out.println("5. läsa in gammal");
        System.out.println("6. Exit");
        System.out.print("Please select an option from 1-6\r\n");

        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        choose();

    }

    private static void choose() {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        if (input == 1) {

        }else if (input == 2){

        }else if (input == 3){

        }else if (input == 4){

        }else if (input == 5){

        }else if (input == 6){
            System.exit(1);
        }
    }
}
