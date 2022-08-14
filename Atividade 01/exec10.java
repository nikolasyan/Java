import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // Nome: Níkolas Yan de Oliveira Costa
    // RA: 2171392211020

    // Faça um programa na Linguagem Java que efetue a apresentação do valor da
    // conversão em real de um valor lido em dólar. O programa deve solicitar o
    // valor da cotação do dólar e também a quantidade de dólares disponível com o
    // usuário, para que seja apresentado o valor em moeda brasileira.

    float cotacaoDolar, dolarDisponivel, brl; // declarando variaveis
    Scanner meuScanner = new Scanner(System.in); // Cria um objeto Scanner

    System.out.println("Digite a cotacao do dolar: "); // pedindo o primeiro valor
    cotacaoDolar = meuScanner.nextFloat(); // coletando os dados

    System.out.println("Digite a quantidade de dolares: "); // pedindo o primeiro valor
    dolarDisponivel = meuScanner.nextFloat(); // coletando os dados
    
    brl = (dolarDisponivel * cotacaoDolar);

    System.out.println("Voce tem este valor em BRL: " + brl); // exibindo o resultado
  }
}