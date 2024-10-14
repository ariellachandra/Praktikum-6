/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanpert6;

/**
 *
 * @author lenovo
 */

import java.util.Scanner;

public class PerkalianN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();
        int i = 1;

        System.out.print("    ");
        for (int j = 1; j <= n; j++) {
            System.out.print(j + "   ");
        }
        System.out.println(); 

        i = 1;

        do {
            System.out.print(i + "   "); 

            int j = 1;

            do {
                System.out.print((i * j) + "   ");
                j++;
            } while (j <= n);

            System.out.println();
            i++;
        } while (i <= n);
    }
}
