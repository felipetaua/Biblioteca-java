import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Menu de opções
    System.out.println("Escolha uma opção: ");
    System.out.println("1. Calcular a Área do Quadrado");
    System.out.println("2. Calcular a Área do Círculo");
    int escolha = scanner.nextInt();

    switch (escolha) {
      case 1:
        // Calculando a Área do Quadrado
        System.out.println("DIgite o lado do quadrado: ");
        double lado = scanner.nextDouble();
        double areaQuadrado = lado * lado;
        System.out.printf("A Área do Quadrado é: %.2f%n", areaQuadrado);
        break;

      case 2:
        // Calculando a Área do Círculo
        System.out.println("Digite o lado o círculo: ");
        double raio = scanner.nextDouble();
        double areaCirculo = Math.PI * raio * raio;
        System.out.printf("A Área do Circulo é: %.2f%n", areaCirculo);

      default:
        // Opção invalida
        System.out.println("Opção invalida!");
        break;
    }
    scanner.close();
  }
}