package lesson3;

import java.util.Scanner;

public class Boolean {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Insira a nota do aluno: ");
        Double grade = scanner.nextDouble();

        boolean passed = grade >= 70;

        if (passed) {
            System.out.println("Você passou!");
        } else {
            System.out.println("Você não passou!");
        }

    }
}
