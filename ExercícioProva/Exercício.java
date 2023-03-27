package ExercícioProva;

import java.util.Scanner;

public class Exercício {
    Scanner sc = new Scanner(System.in);

    // A empresa “Millennium Falcon” contratou você para crie um software de
    // aplicação em Java. A
    // aplicação deverá permitir a “entrada” de dois números, do tipo decimal, e
    // deve realizar operações
    // aritméticas entre eles:
    // a. O Usuário deverá ser capas de escolher a operação Aritmética a ser
    // executada entre os dois
    // números. (Adição, Subtração, Multiplicação, Divisão);
    // b. Ao final das operações aritméticas os resultados devem ser exibidos para o
    // usuário;
    public void exercício1() {
        System.out.println(
                "Digite o número da operação a ser realizada 1(Adição), 2(Subtração), 3(Multiplicação) e 4(Divisão)");
        int operacao = sc.nextInt();
        System.out.println("Agora informe o primeiro némero da conta");
        double nu1 = sc.nextDouble();
        System.out.println("E o segundo número");
        double nu2 = sc.nextDouble();
        if (operacao == 1) {
            System.out.println("O valor da conta é " + (nu1 + nu2));
        }
        if (operacao == 2) {
            System.out.println("O valor da conta é " + (nu1 - nu2));
        }
        if (operacao == 3) {
            System.out.println("O valor da conta é " + (nu1 * nu2));
        }
        if (operacao == 4) {
            System.out.println("O valor da conta é " + (nu1 / nu2));
        }
    }

    // A Escola Corleone do Brooklyn está promovendo uma gincana entre seus alunos,
    // e contratou você
    // para criar um programa em java que lei o no de matrícula do aluno, e
    // distribuía este aluno entre os
    // 4 times que terão na escola, (Time do Chris, Time do Greg, Time do Caruso,
    // Time do Jerome).
    // a. O Programa deve ler o no de Matricula do aluno;
    // b. O Programa deve escolher o Time que o Aluno irá participar;
    public void exercício2() {
        System.out.println("Digite o número da matricula");
        int nMatricula = sc.nextInt();
        int resultado = nMatricula % 4;
        if (resultado == 0) {
            System.out.println("Você está no time do Chris");
        }
        if (resultado == 1) {
            System.out.println("Você está no time do Greg");
        }
        if (resultado == 2) {
            System.out.println("Você está no time do Caruso");
        }
        if (resultado == 3) {
            System.out.println("Você está no time do Jerome");
        }
    }

    // A Quitanda do Seu Madruga está vendendo frutas com a seguinte tabela de
    // preços:
    // Morangos – R$ 3,50 o kilo;
    // Maças – R$2,30 o kilo;
    // Bananas – R$ 1,80 o kilo;
    // Se o cliente comprar mais de 15 Kg em frutas ou o valor total da compra
    // ultrapassar R$ 30,00,
    // receberá ainda um desconto de 10% sobre este total.
    // a. Escreva um algoritmo para ler a quantidade (em Kg) de morangos, a
    // quantidade (em
    // Kg) de maçãs e a quantidade (em Kg) de bananas adquiridas
    // b. escreva o valor a ser pago pelo cliente.
    // c. Faça o upload dos código-fonte no seu GitHub e compartilhe o link;
    // Obs: Corrija os possíveis erros que o programa possa gerar.
    public void exercício3() {
        System.out.println("Insira quantas morango foram compradas");
        int morangos = sc.nextInt();
        System.out.println("Insira quantas maças foram compradas");
        int macas = sc.nextInt();
        System.out.println("Insira quantas bananas foram compradas");
        int bananas = sc.nextInt();
        System.out.println("Agora insira o total de kilos da compra");
        double kg = sc.nextDouble(); 
        
        double R$ = bananas*1.80+macas*2.30+morangos*3.50;
        double precoTotal= 0 ;
        if(kg >=15 || R$>=30){
            precoTotal = R$*0.1;
            System.out.println("O preço total foi de "+precoTotal);
        }else{
            System.out.println("O preço total foi de "+ precoTotal);
        }
     
}
