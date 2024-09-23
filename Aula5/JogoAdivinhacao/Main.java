import java.util.Scanner;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int numeroSecreto = random.nextInt(100) + 1;
    int tentativa = 0;
    int chute;
    boolean acertou = false;

    System.out.println("░░█ █▀█ █▀▀ █▀█   ▄▀█ █▀▄ █ █░█ █ █▄░█ █░█ ▄▀█ █▀▀ ▄▀█ █▀█");
    System.out.println("█▄█ █▄█ █▄█ █▄█   █▀█ █▄▀ █ ▀▄▀ █ █░▀█ █▀█ █▀█ █▄▄ █▀█ █▄█");
    while (!acertou) {
      // Solicitando um número para o usuário
      System.out.println("Digite um número entre 1 e 100");
      chute = scanner.nextInt();

      // Verificando se o chute é maior ou menor que o número
      if (chute == numeroSecreto) {
        System.out.println("█▀█ █▄▄ █▀█ █ █▀▀ ▄▀█ █▀▄ █▀█   █▀█ █▀█ █▀█   ░░█ █▀█ █▀▀ ▄▀█ █▀█ █ ");
        System.out.println("█▄█ █▄█ █▀▄ █ █▄█ █▀█ █▄▀ █▄█   █▀▀ █▄█ █▀▄   █▄█ █▄█ █▄█ █▀█ █▀▄ ▄");
        System.out.println("Parabens você acertou o número secreto em: " + tentativa + " tentativas");
        tentativa++;
        System.out.println("▐▓█▀▀▀▀▀▀▀▀▀█▓▌░▄▄▄▄▄░");
        System.out.println("▐▓█░░▀░░▀▄░░█▓▌░█▄▄▄█░");
        System.out.println("▐▓█░░▄░░▄▀░░█▓▌░█▄▄▄█░");
        System.out.println("▐▓█▄▄▄▄▄▄▄▄▄█▓▌░█████░");
        System.out.println("░░░░▄▄███▄▄░░░░░█████░");

        acertou = true;
      } else if (chute > numeroSecreto) {
        System.out.println("Número secreto é menor! Tente novamente");
        tentativa++;
      } else {
        System.out.println("Número secreto é maior! Tente novamente");
        tentativa++;
      }
    }
    scanner.close();
  }
}