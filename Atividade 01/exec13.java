import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    // Nome: Níkolas Yan de Oliveira Costa
    // RA: 2171392211020

    // Faça um programa na Linguagem Java que receba um número e mostre o resto da
    // divisão por 6.

    Scanner meuScanner = new Scanner(System.in);

    float a, resultado;
    System.out.println("Digite o valor de A:"); // pedindo o primeiro valor
    a = meuScanner.nextFloat(); // coletando os dados

    resultado = a % 6;

    System.out.println("O resto da divisao por 6 é: " + resultado);
  }
}