import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.*;

public class menu {

    private static ArrayList<String> minArrayLista = new ArrayList<String>();

    public static void main(String[] args) {
        menu();

    }

    public static void menu() {
        showMenu();

    }

    private static void showMenu(){
        System.out.println("Loggbok");
        System.out.println("Menu Options:");
        System.out.println("1. visa");
        System.out.println("2. skriv ny");
        System.out.println("3. redigera");
        System.out.println("4. spara");
        System.out.println("5. lasa in gammal");
        System.out.println("6. Exit");
        System.out.print("Please select an option from 1-6\r\n");
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        choose();
    }


    private static void choose() {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        if (input == 1) {
            visa();
        }else if (input == 2){
            skrivNy();
        }else if (input == 3){

        }else if (input == 4){

        }else if (input == 5){

        }else if (input == 6){
            System.exit(1);
        }
    }

    private static void skrivNy(){
        try
        {
            System.out.print("du valde skriv ny. Skriv din text:");

            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in);
            String logg = br.readLine();


            logEntry nyLogg = new logEntry(logg);

            minArrayLista.add(nyLogg.toString());

            showMenu();
        }
        catch(Exception e){

        }
    }

    private static void visa(){
        for(String str:minArrayLista)
            System.out.println(str);
        showMenu();
    }



}
