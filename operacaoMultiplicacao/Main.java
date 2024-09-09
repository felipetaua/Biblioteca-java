import java.util.Scanner;

// Exemplo 3 - Multiplicação
public class Main {
  public static void main(String[] args) {
    // Criando o objeto scanner
    Scanner scanner = new Scanner(System.in);

    // Entrada de informações do usuário
    System.out.println("Digite o primeiro número: ");
    int num1 = scanner.nextInt();

    System.out.println("Digite o segundo número: ");
    int num2 = scanner.nextInt();

    // Multiplicando os dois números
    int soma = num1 * num2;

    // Exibindo o resultado
    System.out.println("O resultado da multiplicação é: " + soma);

    // Fechando o scanner
    scanner.close();
  }

}