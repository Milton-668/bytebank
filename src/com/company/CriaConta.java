package com.company;

public class CriaConta {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);
        //O new instancia a classe tornando em objeto, criando um espaço na memória
        //para acessar os atributos
        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;

        System.out.println("Primeira Conta tem: " + primeiraConta.saldo);
        System.out.println("Segunda Conta tem: " + segundaConta.saldo);
        System.out.println("Primeira Conta tem: " + primeiraConta.agencia);
        System.out.println("Primeira Conta tem: " + primeiraConta.titular);

    }
}
