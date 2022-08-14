import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // Nome: Níkolas Yan de Oliveira Costa
    // RA: 2171392211020

    // Faça um programa na Linguagem Java que leia uma temperatura em graus
    // Fahrenheit e apresentá-la convertida em graus Celsius. A formula de conversão
    // é C <-- (F - 32) * (5/9), sendo f a temperatura em Fahrenheit e C a
    // temperatura em Celsius.

    double F, C; // declarando variaveis
    Scanner meuScanner = new Scanner(System.in); // Cria um objeto Scanner
    System.out.println("Digite a temperatura em Fahrenheit"); // pedindo o primeiro valor
    F = meuScanner.nextDouble(); // coletando os dados

    C = (F - 32) / 1.8; // acredito que a formula esteja errada, entao substitui por essa

    System.out.println("Valor em Celsius: " + C); // exibindo o resultado
  }
}