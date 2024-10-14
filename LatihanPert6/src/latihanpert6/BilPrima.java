/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanpert6;

/**
 *
 * @author lenovo
 */
public class BilPrima {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            int pembagi = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    pembagi++;
                }
            }
            if (pembagi == 2) {
                System.out.println(i + " : Prima");
            } else {
                System.out.println(i + " : Bukan Prima");
            }
        }
    }
}
