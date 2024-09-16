import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Criando uma instancia do Scanner
    Scanner scanner = new Scanner(System.in);

    // Solicitando o tamanho do Array
    System.out.println("Quantos números você deseja inserir?");
    int tamanho = scanner.nextInt();

    // Criando o array
    Integer[] numeros = new Integer[tamanho];

    // Inserindo os números no Array
    for (int i = 0; i < tamanho; i++) {
      System.out.println("Digite o número " + (i + 1) + ": ");
      numeros[i] = scanner.nextInt();
    }

    // Ordenando o Array com o sort
    Arrays.sort(numeros, Collections.reverseOrder());

    // Exibindo todos os numeros do Array
    for (int i = 0; i < tamanho; i++) {
      System.out.println(numeros[i]);
    }

    // Fechando o scanner
    scanner.close();
  }
}