
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] largeArray = new String[20];
        String[] firstArray = new String[10];
        String[] secondArray = new String[10];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 20 строк:");
        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = scanner.nextLine();

        }
    }
}