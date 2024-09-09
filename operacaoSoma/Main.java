import java.util.Scanner;

// Exemplo 2 - Somando dois numeros
public class Main {
  public static void main(String[] args) {
    // Criando um objeto Scanner
    Scanner scanner = new Scanner(System.in);

    // Digite o primeiro numero
    System.out.println("Digite o primeiro número");
    int num1 = scanner.nextInt();

    // Digite o segundo numero
    System.out.println("Digite o segundo número");
    int num2 = scanner.nextInt();

    // Somando os dois numeros
    int soma = num1 + num2;

    // Exibindo o resultado
    System.out.println("resultado da soma é: " + soma);

    // Fechando o Scanner
    scanner.close();
  }
}