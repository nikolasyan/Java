import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // Nome: Níkolas Yan de Oliveira Costa
    // RA: 2171392211020

    // Faça um programa na Linguagem Java que leia a idade de uma pessoa expressa em
    // ano, mês e dia e mostre-as em dias.

    int ano, meses, dias; // declarando variaveis
    Scanner meuScanner = new Scanner(System.in); // Cria um objeto Scanner

    System.out.println("Digite o ano de nascimento: "); // pedindo o primeiro valor
    ano = meuScanner.nextInt(); // coletando os dados

    System.out.println("Digite o mes de nascimento: "); // pedindo o segundo valor
    meses = meuScanner.nextInt(); // coletando os dados

    System.out.println("Digite o dia do nascimento: "); // pedindo o terceiro valor
    dias = meuScanner.nextInt(); // coletando os dados

    
    dias = ano * 365 + meses * 30 + dias;

    System.out.println("Resultado final: " + dias); // exibindo o resultado
  }
}