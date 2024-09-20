import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String num1;
    Double num2;
    String operacao;

    System.out.println("█▀▀ ▄▀█ █░░ █▀▀ █░█ █░░ ▄▀█ █▀▄ █▀█ █▀█ ▄▀█");
    System.out.println("█▄▄ █▀█ █▄▄ █▄▄ █▄█ █▄▄ █▀█ █▄▀ █▄█ █▀▄ █▀█");

    System.out.println("Digite o primeiro número: ");
    num1 = scanner.nextLine();

    try {
      int numero = Integer.parseInt(num1);
      System.out.println("Digite a operação (+, - , *, /");
      operacao = scanner.nextLine();

      System.out.println("Digite o segundo Número: ");
      num2 = scanner.nextDouble();

      // Realizando a operação escolhida pelo metodo calculo
      System.out.println("Resultado: " + calculo(numero, operacao, num2));

      System.out.println("█▀█ █▄▄ █▀█ █ █▀▀ ▄▀█ █▀▄ █▀█");
      System.out.println("█▄█ █▄█ █▀▄ █ █▄█ █▀█ █▄▀ █▄█");
      scanner.close();
    } catch (NumberFormatException e) {
      System.out.println("No");
    }
  }

  public static Double calculo(int num1, String operacao, Double num2) {
    Double resposta = 0.0;

    // if aninhados
    if (operacao.equals("+")) {
      resposta = num1 + num2;
    } else if (operacao.equals("-")) {
      resposta = num1 - num2;
    } else if (operacao.equals("*")) {
      resposta = num1 * num2;
    } else if (operacao.equals("/")) {
      resposta = num1 / num2;
    }
    return resposta;
  }
}
