package com.practice.TCSproblem;

import java.util.Scanner;

public class Practice {

    //ParkingLot
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of rows (M): ");
            int M = scanner.nextInt();
            System.out.print("Enter the number of columns (N): ");
            int N = scanner.nextInt();

            int[][] parkingLot = new int[M][N];
            System.out.println("Enter the elements of the matrix (0/1):");
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    parkingLot[i][j] = scanner.nextInt();
                }
            }

            int maxCars = 0;
            int maxRowIndex = -1;
            for (int i = 0; i < M; i++) {
                int carsInRow = 0;
                for (int j = 0; j < N; j++) {
                    if (parkingLot[i][j] == 1) {
                        carsInRow++;
                    }
                }
                if (carsInRow > maxCars) {
                    maxCars = carsInRow;
                    maxRowIndex = i;
                }
            }

            // Output result
            if (maxRowIndex == -1) {
                System.out.println("No cars parked in any row.");
            } else {
                System.out.println("Row with maximum cars parked: " + maxRowIndex);
            }
        }
    }
