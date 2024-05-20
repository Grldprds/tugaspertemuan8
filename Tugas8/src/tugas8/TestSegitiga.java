/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas8;

/**
 *
 * @author Geral
 */
import java.util.Scanner;

public class TestSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sisi pertama dari segitiga: ");
        double side1 = input.nextDouble();

        System.out.print("Masukkan sisi kedua dari segitiga: ");
        double side2 = input.nextDouble();

        System.out.print("Masukkan sisi ketiga dari segitiga: ");
        double side3 = input.nextDouble();

        System.out.print("Masukkan warna: ");
        String color = input.next();

        System.out.print("Apakah segitiga terisi (true/false): ");
        boolean filled = input.nextBoolean();

        Segitiga segitiga = new Segitiga(side1, side2, side3);
        segitiga.setColor(color);
        segitiga.setFilled(filled);

        System.out.println("Luas segitiga adalah: " + segitiga.getArea());
        System.out.println("Keliling segitiga adalah: " + segitiga.getPerimeter());
        System.out.println("Warna segitiga adalah: " + segitiga.getColor());
        System.out.println("Apakah segitiga terisi: " + segitiga.isFilled());
        System.out.println(segitiga.toString());
    }
}
