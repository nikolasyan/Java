import java.util.Scanner;

class Main {
    public static void main(String[] args) {
      //Nome: Níkolas Yan de Oliveira Costa
      //RA: 2171392211020
      //Objetivo: Faça um programa na Linguagem Java que receba 2 números e apresente a multiplicação dos dois números.

      int a, b; //declarando variaveis

      System.out.println("Digite o valor de 'A'"); //pedindo o primeiro valor
      Scanner meuScanner= new Scanner(System.in);  // Cria um objeto Scanner
      a = meuScanner.nextInt(); //coletando os dados

      System.out.println("Digite o valor de 'B'"); //pedindo o segundo valor
      meuScanner= new Scanner(System.in);  //objeto Scanner
      b = meuScanner.nextInt(); //coletando os dados

      System.out.println("Resultado da multiplicação: " + (a * b)); //exibindo o resultado
    }
  }