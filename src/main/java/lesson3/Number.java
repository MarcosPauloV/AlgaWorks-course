package lesson3;

//types of variables

import java.util.Scanner;

public class Number {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Insira um valor para elevalo ao quadrado: ");
        Double num = scanner.nextDouble();
        System.out.println("O quadrado do número inserido é: " + Math.pow(num,2));

        scanner.close();
    }



}


