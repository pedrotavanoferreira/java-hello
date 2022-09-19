package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int resultado, num1, num2;

        System.out.println("digite o numero 1 ");
        num1 = entrada.nextInt();

        System.out.println("digite o numero 2 ");
        num2 = entrada.nextInt();

        resultado = num1 + num2;

        System.out.println("soma = " + resultado);
    }
}
