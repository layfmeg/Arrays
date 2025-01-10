
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] largeArray = new int[20];
        int[] firstHalf = new int[10];
        int[] secondHalf = new int[10];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 20 строк:");
        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = scanner.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            firstHalf[i] = largeArray[i];
            secondHalf[i] = largeArray[i + 10];
        }

        System.out.println("Первая половина массива: ");
        for (int i = 0; i < firstHalf.length; i++) {
            System.out.println(firstHalf[i]);
        }

        System.out.println("Вторая половина массива: ");
        for (int i = 0; i < secondHalf.length; i++) {
            System.out.println(secondHalf[i]);
        }
    }
    }
