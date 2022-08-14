import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // Nome: Níkolas Yan de Oliveira Costa
    // RA: 2171392211020
    // Objetivo: 04. Faça um programa na Linguagem Java que leia uma temperatura em
    // graus Celsius e apresentá-la convertida em graus Fahrenheit.
    // A fórmula de conversão é F <-- (9 * C + 160) /5, sendo f a temperatura em
    // Fahrenheit e C a temperatura em Celsius.

    float F, C; // declarando variaveis
    Scanner meuScanner = new Scanner(System.in); // Cria um objeto Scanner
    System.out.println("Digite a temperatura em Celsius"); // pedindo o primeiro valor
    C = meuScanner.nextFloat(); // coletando os dados

    F = (9 * C + 160) /5;

    System.out.println("Valor em Fahrenheit: " + F); // exibindo o resultado
  }
}