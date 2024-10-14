/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanpert6;

/**
 *
 * @author lenovo
 */
public class BilGanjilGenap {
    public static void main(String[] args) {
        int i = 0;

        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println(i + " : Genap");
            } else {
                System.out.println(i + " : Ganjil");
            }
            i++;
        }
    }
}
