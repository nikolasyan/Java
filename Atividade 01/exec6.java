import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // Nome: Níkolas Yan de Oliveira Costa
    // RA: 2171392211020

    // Faça um programa na Linguagem Java para calcular e apresentar o valor do
    // volume de uma lata de óleo, utilizando a fórmula:VOLUME <-- 3.14159 * RAIO2 * ALTURA.

    double VOLUME, RAIO, ALTURA; // declarando variaveis
    Scanner meuScanner = new Scanner(System.in); // Cria um objeto Scanner
    
    System.out.println("Digite o RAIO"); // pedindo o primeiro valor
    RAIO = meuScanner.nextDouble(); // coletando os dados

    System.out.println("Digite a ALTURA");// pedindo o segundo valor
    ALTURA = meuScanner.nextDouble(); // pedindo o primeiro valor

    VOLUME = 3.14159 * (RAIO * RAIO) * ALTURA;

    System.out.println("O Volume da lata de oleo e: " + VOLUME); // exibindo o resultado
  }
}