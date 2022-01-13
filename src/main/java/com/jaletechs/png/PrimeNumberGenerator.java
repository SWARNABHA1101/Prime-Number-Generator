package com.jaletechs.png;

import com.jaletechs.png.controller.BruteForceStrategy;
import com.jaletechs.png.controller.GenerationStrategy;
import com.jaletechs.png.controller.OptimizedBruteForceStrategy;
import com.jaletechs.png.controller.SieveOfEratosthenesStrategy;
import com.jaletechs.png.model.GenerationResponse;

import java.util.Scanner;

/**
 * Created by jaletechs on 2019-05-29.
 */
public class PrimeNumberGenerator {
    public static void main(String[] args) {
        PrimeNumberGenerator generator = new PrimeNumberGenerator();
        generator.run();
    }

    private void run() {
        displayWelcomeMessage();
        displayAvailableStrategies();
    }

    private void displayWelcomeMessage() {
        System.out.println("=================================================================");
        System.out.println("******************** Prime Number Generator *********************");
        System.out.println("=================================================================\n");
    }

    private void displayAvailableStrategies() {
        Scanner scanner = new Scanner(System.in);

        GenerationStrategy strategy;

        System.out.println("Enter start of range (inclusive):");
        int start = Integer.parseInt(scanner.next());
        System.out.println("Enter end of range (exclusive):");
        int end = Integer.parseInt(scanner.next());

        System.out.println("Please select a generation strategy: \n");

        System.out.println("1. Brute Force");
        System.out.println("2. Brute Force (With optimization)");
        System.out.println("3. Sieve of Eratosthenes\n");

        System.out.print("Strategy: ");
        System.out.println();

        int option = Integer.parseInt(scanner.next());

        if (option == 1) {
            strategy = new BruteForceStrategy();
        } else if (option == 2) {
            strategy = new OptimizedBruteForceStrategy();
        } else if (option == 3) {
            strategy = new SieveOfEratosthenesStrategy();
        } else {
            System.out.println("No strategy available for this option!!!");
            return;
        }

        GenerationResponse response = strategy.generate(start, end);
        System.out.println("RESULT: " + response.getPrimeNumbers());
        System.out.println("Time Elapsed: " + response.getTimeElapsed() + " ms");
        System.out.println("Prime number count: " + response.getNumberOfPrimes());
    }
}
