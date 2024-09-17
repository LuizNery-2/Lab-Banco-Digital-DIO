package org.example;

import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Cliente luiz = new Cliente("Luiz","123456789");


        Conta cc = new ContaCorrente(luiz);
        Conta poupanca = new ContaPoupanca(luiz);

        cc.depositar(100);
        cc.transferir(poupanca, 100);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}