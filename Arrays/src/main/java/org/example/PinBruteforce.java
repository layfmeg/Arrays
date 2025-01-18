package org.example;

public class PinBruteforce {
    public static void main(String[] args) {
        int targetPin = 9407;
        int iterations = 0; // количество попыток

        for (int pin = 0; pin < 9999; pin++) {
            iterations++;
            if (pin == targetPin) {
                System.out.println("PIN-код підібрано: " + pin);
                System.out.println("Кількість ітерацій: " + iterations);
                break;
            }
        }
    }
}
