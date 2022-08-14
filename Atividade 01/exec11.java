import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // Nome: Níkolas Yan de Oliveira Costa
    // RA: 2171392211020

    // Faça um programa na Linguagem Java para ler dois valores inteiros para as
    // variáveis A e B e efetuar a troca dos valores de forma que a variável A passe
    // a possuir o valor da variável B e a variável B passe a possuir o valor da
    // variável A. Apresentar os valores trocados.

    int a, b, x; // declarando variaveis
    Scanner meuScanner = new Scanner(System.in); // Cria um objeto Scanner

    System.out.println("Digite o valor de A:"); // pedindo o primeiro valor
    a = meuScanner.nextInt(); // coletando os dados

    System.out.println("Digite o valor de B");// pedindo o segundo valor
    b = meuScanner.nextInt(); // pedindo o primeiro valor

    x = a;
    a = b;
    b = x;

    System.out.println("A: " + a); // exibindo o resultado
    System.out.println("B: " + b); // exibindo o resultado
  }
}