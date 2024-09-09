import java.util.Scanner;
// Exemplo 1 - Entrada e Saida de dados
public class Main {
  public static void main(String[] args) {
    // Criando um objeto scanner para ler o teclado
    Scanner scanner = new Scanner(System.in);

    // Solicitando o nome do usuário
    System.out.print("Digite seu nome: ");
    String nome = scanner.nextLine();
    
    System.out.print("Digite seu nome: ");
    String idade = scanner.nextLine();

    // Exibindo o que o usuário digitou no teclado
    System.out.println("Olá "+ nome + " você possui " + idade + " anos, Seja bem-vindo(a)!");

    // Fechando o scanner
    scanner.close();
  }
}