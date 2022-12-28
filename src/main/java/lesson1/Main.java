package lesson1;

import java.util.Scanner;

//Calculate the change
public class Main {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.print("Insira o valor do produto: ");
        Double value = scanner.nextDouble();

        System.out.print("Insira o valor que o cliete pagou: ");
        Double valuePaid = scanner.nextDouble();

        if((valuePaid - value) > 0) System.out.println("O troco e: " + ((valuePaid-value)));
        else if(valuePaid < value) System.out.println("Voce ficou devendo: " + ((valuePaid-value)*-1));
        else System.out.println("O valor foi quitado com sucesso!");

        scanner.close();
    }
}