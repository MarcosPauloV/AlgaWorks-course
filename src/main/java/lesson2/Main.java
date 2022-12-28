package lesson2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.print("Insira a sua altura em metros: ");
        Double height = scanner.nextDouble();

        System.out.print("Insira o seu peso em quilos: ");
        Double weight = scanner.nextDouble();

        System.out.println("O seu IMC é: " + (weight / Math.pow(height, 2)));

    }
}