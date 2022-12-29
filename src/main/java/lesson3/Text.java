package lesson3;
import java.util.Scanner;

public class Text {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.print("Insira o seu nome com o sobrenome: ");
        String name = scanner.nextLine();

        String[] split = name.split(" ");

        System.out.println("O seu nome é: " + split[0] + " e seu sobrenome é: " + split[1]);

        scanner.close();

    }

}
