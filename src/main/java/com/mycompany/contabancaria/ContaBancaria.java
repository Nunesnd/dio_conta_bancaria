package com.mycompany.contabancaria;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class ContaBancaria {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#,##0.00");

        System.out.println("Bem vindo ao Banco Nunes!");

        System.out.print("Por favor, informe seu Nome: ");
        String nome = scanner.nextLine();

        System.out.print(nome + ", por favor insira o número de sua agência: ");
        int agencia = scanner.nextInt();

        System.out.print("Agora o número de sua conta: ");
        int conta = scanner.nextInt();

        System.out.println("Quanto irá depositar na conta: " + conta + " da agência "+agencia + "?");
        double saldo = scanner.nextDouble();
        String saldoFormatado = formatador.format(saldo);

        System.out.println("Cliente " + nome + "o saldo da conta " + conta + ", na agencia "+ agencia + ", é de R$"+saldoFormatado + "e já se encotra disponível para saque");

    }
}
