import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        System.out.printf("Hola %s \n", str);
        System.out.printf(" y adiós %s", str);

    }

}