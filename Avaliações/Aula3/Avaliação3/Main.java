
public class Main {
  public static void main(String[] args) {
    Pessoa pessoa1 = new Pessoa("João", 25, "080");
    Pessoa pessoa2 = new Pessoa("Marta", 30, "008");
    Pessoa pessoa3 = new Pessoa("João", 25, "080");

    System.out.println("A pessoa1 é igual a pessoa2? " + pessoa1.equals(pessoa2));

    System.out.println("A pessoa1 é igual a pessoa3? " + pessoa1.equals(pessoa3));
  }
}