/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.chalproject1;
import java.util.Scanner;


public class Chalproject1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms in the Fibonacci sequence: ");
        int terms = scanner.nextInt();

        int first = 0, second = 1;

        System.out.print("Fibonacci Sequence: " + first + ", " + second);

        for (int i = 3; i <= terms; i++) {
            int next = first + second;
            System.out.print(", " + next);

            first = second;
            second = next;
        }

        scanner.close();
    }
}
