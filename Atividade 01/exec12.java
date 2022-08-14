import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // Nome: Níkolas Yan de Oliveira Costa
    // RA: 2171392211020

    // Faça um programa na Linguagem Java para efetuar a leitura de um número
    // inteiro e apresentar o resultado do quadrado desse número.

    int a; // declarando variaveis
    Scanner meuScanner = new Scanner(System.in); // Cria um objeto Scanner

    System.out.println("Digite o valor de A:"); // pedindo o primeiro valor
    a = meuScanner.nextInt(); // coletando os dados

    a = a * a;

    System.out.println("A ao quadrado é igual: " + a); // exibindo o resultado

  }
}