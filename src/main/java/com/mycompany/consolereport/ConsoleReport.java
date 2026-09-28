/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.consolereport;

public class ConsoleReport {

    public static void main(String[] args) {

        // Single dimensional arrays: city names and console names
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};

        // Two dimensional array: rows = cities, columns = consoles
        int[][] sales = {
            {1000, 2000, 3000},   // Cape Town
            {2000, 3000, 4000},   // Port Elizabeth
            {1500, 1100, 1200}    // Pretoria
        };

        // Single dimensional array to hold the total sales per city
        int[] cityTotals = new int[cities.length];

        String line = "----------------------------------------------------------";

        // Report heading
        System.out.println(line);
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println(line);

        // Column headings (console names)
        System.out.printf("%-18s", "");
        for (int col = 0; col < consoles.length; col++) {
            System.out.printf("%-12s", consoles[col]);
        }
        System.out.println();

        // Rows: each city with its sales per console
        for (int row = 0; row < cities.length; row++) {
            System.out.printf("%-18s", cities[row]);
            for (int col = 0; col < consoles.length; col++) {
                System.out.printf("%-12d", sales[row][col]);
                cityTotals[row] += sales[row][col];   // accumulate city total
            }
            System.out.println();
        }

        // Totals section
        System.out.println();
        System.out.println(line);
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println(line);

        // Print each city's total and track the highest
        int highestIndex = 0;
        for (int row = 0; row < cities.length; row++) {
            System.out.printf("%-18s%d%n", cities[row], cityTotals[row]);
            if (cityTotals[row] > cityTotals[highestIndex]) {
                highestIndex = row;
            }
        }

        // City with the most sales
        System.out.println();
        System.out.println("CITY WITH THE MOST SALES: " + cities[highestIndex]);
        System.out.println(line);
    }
}
