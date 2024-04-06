package com.practice.TCSproblem;
import java.util.Scanner;

public class ZooAnimals {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the total number of animals (N): ");
            int N = scanner.nextInt();
            System.out.print("Enter the total number of legs (L): ");
            int L = scanner.nextInt();

            // Checking constraints
            if (N <= 0 || L <= 0 || L % 2 != 0 || N >= L) {
                System.out.println("Invalid input. Please enter valid values satisfying constraints.");
                return;
            }
            // Calculate number of four-legged animals
            int fourLegs = (4 * N - L) / 2;
            // Calculate number of two-legged animals
            int twoLegs = N - fourLegs;

            // Displaying results
            System.out.println("Number of four-legged animals: " + fourLegs);
            System.out.println("Number of two-legged animals: " + twoLegs);
        }


}
