package org.example;

public class PalindromeChecker {
    public static void main(String[] args) {
        String palindrome = "а роза упала на лапу азора";

        String cleanedPalindrome = palindrome.replaceAll("[^a-zA-Zа-яА-Я0-9]", "");

        String reversedPalindrome = new StringBuilder(cleanedPalindrome).reverse().toString();

        if (cleanedPalindrome.equals(reversedPalindrome)) {
            System.out.println("Строка является палиндромом.");
        } else {
            System.out.println("Строка не является палиндромом.");
        }
    }
}
