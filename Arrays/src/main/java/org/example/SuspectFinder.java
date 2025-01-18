package org.example;

public class SuspectFinder {
    public static void main(String[] args) {
        double[] probabilities = {0.1, 0.2, 0.15, 0.05, 0.3, 0.25, 0.4, 0.35, 0.05, 0.1};
        int maxIndex = 0;

        for (int i = 1; i < probabilities.length; i++) {
            if (probabilities[i] > probabilities[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println("Номер подозреваемого с максимальной вероятностью: " + maxIndex);
    }
}
