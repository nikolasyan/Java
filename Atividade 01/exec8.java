import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // Nome: Níkolas Yan de Oliveira Costa
    // RA: 2171392211020

  
    //Faça um programa na Linguagem Java que calcule a área da circunferência.

    double area, raio; // declarando variaveis
    Scanner meuScanner = new Scanner(System.in); // Cria um objeto Scanner
    
    System.out.println("Digite o RAIO"); // pedindo o primeiro valor
    raio = meuScanner.nextDouble(); // coletando os dados

    area = 3.14159 * (raio * raio);

    System.out.println("a área da circunferência é: " + area); // exibindo o resultado
  }
}