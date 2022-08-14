import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // Nome: Níkolas Yan de Oliveira Costa
    // RA: 2171392211020

    // Faça um programa na Linguagem Java para efetuar o cálculo e a apresentação do
    // valor de uma prestação em atraso, utilizando a fórmula PRESTAÇÃO <-- VALOR +
    // (VALOR * (TAXA/100) * TEMPO).

    float prestacao, valor, taxa, tempo; // declarando variaveis
    Scanner meuScanner = new Scanner(System.in); // Cria um objeto Scanner

    System.out.println("Para começar digite o valor: "); // pedindo o primeiro valor
    valor = meuScanner.nextFloat(); // coletando os dados

    System.out.println("Agora digite a taxa: "); // pedindo o segundo valor
    taxa = meuScanner.nextFloat(); // coletando os dados

    System.out.println("Agora digite o tempo: "); // pedindo o terceiro valor
    tempo = meuScanner.nextFloat(); // coletando os dados

    prestacao = valor + (valor * (taxa/100) * tempo);

    System.out.println("Resultado final: " + prestacao); // exibindo o resultado
  }
}